
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import entities.Book;
import ead.Ead;
import dto.ead.EadDTO;
import mods.ModsCollection;
import dto.mods.ModsDTO;
import service.ExportService;

public class TestingApp {
    public static void main(String[] args) throws JAXBException, IOException {
        convertBookToMods();
        convertBookToEad();
    }


    private static void convertBookToMods() throws JAXBException {
        Book book = new Book();
        book.fillWithData();

        List<String> mappingFiles = new ArrayList<>();

        mappingFiles.add("file:" + System.getProperty("user.dir") + "/src/main/resources/mapping/MappingConfig_ModsDTO_Book.xml");
        Mapper mapper = new DozerBeanMapper(mappingFiles);

        ModsDTO modsDTOFromBook = mapper.map(book,ModsDTO.class);
        modsDTOFromBook.getFieldNames();

        ExportService exportService = new ExportService();
        ModsCollection modsCollection = exportService.convertToMods(modsDTOFromBook);

        JAXBContext jaxbContext = JAXBContext.newInstance(ModsCollection.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(modsCollection,System.out);
        System.out.println("");
    }

    private static void convertBookToEad() throws JAXBException {
        Book book = new Book();
        book.fillWithData();

        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("file:" + System.getProperty("user.dir") + "/src/main/resources/mapping/MappingConfig_EadDTO_Book.xml");
        Mapper mapper = new DozerBeanMapper(mappingFiles);
        EadDTO eadDTO = mapper.map(book,EadDTO.class);

        ExportService exportService = new ExportService();
        Ead ead = exportService.convertToEad(eadDTO);

        JAXBContext jaxbContext = JAXBContext.newInstance(Ead.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(ead,System.out);
    }

}
