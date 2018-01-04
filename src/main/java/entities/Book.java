package entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private String title;
    private String genre;
    private String author;
    private String version;
    private String type;
    private String publisher;
    private Date publicationDate;
    private String info;
    private String placeOfPublication;
    private Metadata metadata;


    public void fillWithData() {
        setAuthor("Gene Roddenberry");
        setTitle("Star Trek: Das unentdeckte Land");
        setGenre("sci-fi");
        setVersion("1.3.5");
        setType("text");
        setInfo("https://de.wikipedia.org/wiki/Star_Trek_VI:_Das_unentdeckte_Land");
        setPlaceOfPublication("San Francisco");
        setPublisher("Sternenflotten Verlag");
        setPublicationDate(new Date(91,10,2));

        List<Metadate> metadateList = new LinkedList<>();
        metadateList.add(new Metadate("FieldType1","Field1Value"));
        metadateList.add(new Metadate("FieldType2","Field2Value"));

        Metadata metadata = new Metadata();
        metadata.setMetadateList(metadateList);
        setMetadata(metadata);
    }

    /**
     * Gets metadata.
     *
     * @return The metadata.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata.
     *
     * @param metadata The metadata.
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets version.
     *
     * @return The version.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets version.
     *
     * @param version The version.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets title.
     *
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title The title.
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Gets author.
     *
     * @return The author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author The author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets type.
     *
     * @return The type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type The type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets publisher.
     *
     * @return The publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets publisher.
     *
     * @param publisher The publisher.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets publicationDate.
     *
     * @return The publicationDate.
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets publicationDate.
     *
     * @param publicationDate The publicationDate.
     */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Gets info.
     *
     * @return The info.
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets info.
     *
     * @param info The info.
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * Gets placeOfPublication.
     *
     * @return The placeOfPublication.
     */
    public String getPlaceOfPublication() {
        return placeOfPublication;
    }

    /**
     * Sets placeOfPublication.
     *
     * @param placeOfPublication The placeOfPublication.
     */
    public void setPlaceOfPublication(String placeOfPublication) {
        this.placeOfPublication = placeOfPublication;
    }
}
