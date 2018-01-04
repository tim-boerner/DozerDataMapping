package service;

import javax.xml.bind.JAXBException;

import ead.Author;
import ead.Control;
import ead.Date;
import ead.Filedesc;
import ead.Publicationstmt;
import ead.Publisher;
import ead.Ead;
import ead.Titleproper;
import ead.Titlestmt;
import dto.ead.EadDTO;
import mods.CodeOrText;
import mods.DateType;
import mods.GenreType;
import mods.LocationType;
import mods.ModsCollection;
import mods.ModsType;
import mods.NamePartType;
import mods.NameType;
import mods.NameTypeAttribute;
import mods.ObjectFactory;
import mods.OriginInfoType;
import mods.PlaceTermType;
import mods.PlaceType;
import mods.RoleType;
import mods.TitleInfoType;
import mods.UrlType;
import dto.mods.ModsDTO;

public class ExportService {

    public ModsCollection convertToMods(ModsDTO modsDTO) throws JAXBException {

        ObjectFactory modsObjectFactory = new ObjectFactory();

        ModsType modsType = modsObjectFactory.createModsType();
        modsType.setVersion("3.3");

        //title
        TitleInfoType titleInfoType = modsObjectFactory.createTitleInfoType();
        titleInfoType.getTitleOrSubTitleOrPartNumber().add(modsObjectFactory.createBaseTitleInfoTypeTitle(modsDTO.getTitleInfo().getTitle()));
        modsType.getModsGroup().add(titleInfoType);

        //author
        //name
        NameType nameType = new NameType();
        nameType.setNameType(NameTypeAttribute.PERSONAL);
        NamePartType namePartType = modsObjectFactory.createNamePartType();
        namePartType.setValue(modsDTO.getName().getNamePart());
        nameType.getNamePartOrDisplayFormOrAffiliation().add(modsObjectFactory.createNameTypeNamePart(namePartType));
        modsType.getModsGroup().add(nameType);
        //role
        RoleType roleType = new RoleType();
        RoleType.RoleTerm roleTerm = new RoleType.RoleTerm();
        roleTerm.setType(CodeOrText.TEXT);
        roleTerm.setValue("author");
        roleType.getRoleTerm().add(roleTerm);
        nameType.getNamePartOrDisplayFormOrAffiliation().add(modsObjectFactory.createNameTypeRole(roleType));

        //genre
        GenreType genreType = modsObjectFactory.createGenreType();
        genreType.setValue(modsDTO.getGenre());
        modsType.getModsGroup().add(genreType);

        //location
        UrlType urlType = modsObjectFactory.createUrlType();
        urlType.setValue(modsDTO.getLocation().getUrl());
        LocationType locationType = modsObjectFactory.createLocationType();
        locationType.getUrl().add(urlType);
        modsType.getModsGroup().add(locationType);

        //originInfo
        //place
        PlaceTermType placeTermType = modsObjectFactory.createPlaceTermType();
        placeTermType.setType(CodeOrText.TEXT);
        placeTermType.setValue(modsDTO.getOriginInfo().getPlace().getPlaceTerm());

        PlaceType placeType = modsObjectFactory.createPlaceType();
        placeType.getPlaceTerm().add(placeTermType);

        OriginInfoType originInfoType = modsObjectFactory.createOriginInfoType();
        originInfoType.getPlaceOrPublisherOrDateIssued().add(modsObjectFactory.createOriginInfoTypePlace(placeType));

        //publisher
        originInfoType.getPlaceOrPublisherOrDateIssued().add(modsObjectFactory.createOriginInfoTypePublisher(modsDTO.getOriginInfo().getPublisher()));

        //dateIssued
        DateType dateType = modsObjectFactory.createDateType();
        dateType.setValue(modsDTO.getOriginInfo().getDateIssued());
        originInfoType.getPlaceOrPublisherOrDateIssued().add(modsObjectFactory.createOriginInfoTypeDateIssued(dateType));

        modsType.getModsGroup().add(originInfoType);

        ModsCollection modsCollection = new ModsCollection();
        modsCollection.getMods().add(modsType);

        return modsCollection;
    }

    public Ead convertToEad(EadDTO eadDTO) {

        ead.ObjectFactory eadObjectfactory = new ead.ObjectFactory();

        Titleproper titleproper = eadObjectfactory.createTitleproper();
        titleproper.getContent().add(eadDTO.getControl().getFiledesc().getTitlestmt().getTitleproper());

        Author author = eadObjectfactory.createAuthor();
        author.getContent().add(eadDTO.getControl().getFiledesc().getTitlestmt().getAuthor());

        Titlestmt Titlestmt = eadObjectfactory.createTitlestmt();
        Titlestmt.getTitleproper().add(titleproper);
        Titlestmt.getAuthor().add(author);

        Publicationstmt publicationstmt = eadObjectfactory.createPublicationstmt();
        Publisher publisher = eadObjectfactory.createPublisher();
        publisher.getContent().add(eadDTO.getControl().getFiledesc().getPublicationstmt().getPublisher());
        publicationstmt.getPublisherOrDateOrAddress().add(publisher);

        Date date = eadObjectfactory.createDate();
        date.getContent().add(eadDTO.getControl().getFiledesc().getPublicationstmt().getDate());
        publicationstmt.getPublisherOrDateOrAddress().add(date);

        Filedesc filedesc = eadObjectfactory.createFiledesc();
        filedesc.setTitlestmt(Titlestmt);
        filedesc.setPublicationstmt(publicationstmt);

        Control control = eadObjectfactory.createControl();
        control.setFiledesc(filedesc);

        Ead convertedEad = eadObjectfactory.createEad();
        convertedEad.setControl(control);

        return convertedEad;
    }
}

