package dto.mods;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ModsDTO {
    private String typeOfResource;
    private String genre;

    private TitleInfo titleInfo;
    private Location location;
    private OriginInfo originInfo;
    private Name name;

    private String metadatafield1;
    private String metadatafield2;

    public List<String> getFieldNames() {
        Field[] fields = this.getClass().getDeclaredFields();

        List<String> list = new ArrayList<>();
        for (Field field : fields) {
            list.add(field.getName());
        }
        return list;
    }

    /**
     * Gets metadatafield1.
     *
     * @return The metadatafield1.
     */
    public String getMetadatafield1() {
        return metadatafield1;
    }

    /**
     * Sets metadatafield1.
     *
     * @param metadatafield1 The metadatafield1.
     */
    public void setMetadatafield1(String metadatafield1) {
        this.metadatafield1 = metadatafield1;
    }

    /**
     * Gets metadatafield2.
     *
     * @return The metadatafield2.
     */
    public String getMetadatafield2() {
        return metadatafield2;
    }

    /**
     * Sets metadatafield2.
     *
     * @param metadatafield2 The metadatafield2.
     */
    public void setMetadatafield2(String metadatafield2) {
        this.metadatafield2 = metadatafield2;
    }

    /**
     * Gets typeOfResource.
     *
     * @return The typeOfResource.
     */
    public String getTypeOfResource() {
        return typeOfResource;
    }

    /**
     * Sets typeOfResource.
     *
     * @param typeOfResource The typeOfResource.
     */
    public void setTypeOfResource(String typeOfResource) {
        this.typeOfResource = typeOfResource;
    }

    /**
     * Gets location.
     *
     * @return The location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location The location.
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Gets titleInfo.
     *
     * @return The titleInfo.
     */
    public TitleInfo getTitleInfo() {
        return titleInfo;
    }

    /**
     * Sets titleInfo.
     *
     * @param titleInfo The titleInfo.
     */
    public void setTitleInfo(TitleInfo titleInfo) {
        this.titleInfo = titleInfo;
    }

    /**
     * Gets genre.
     *
     * @return The genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre The genre.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets originInfo.
     *
     * @return The originInfo.
     */
    public OriginInfo getOriginInfo() {
        return originInfo;
    }

    /**
     * Sets originInfo.
     *
     * @param originInfo The originInfo.
     */
    public void setOriginInfo(OriginInfo originInfo) {
        this.originInfo = originInfo;
    }

    /**
     * Gets name.
     *
     * @return The name.
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name The name.
     */
    public void setName(Name name) {
        this.name = name;
    }
}
