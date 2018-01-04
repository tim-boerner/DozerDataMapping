package dto.mods;

public class OriginInfo {
    private String publisher;
    private String dateIssued;
    private Place place;

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
     * Gets dateIssued.
     *
     * @return The dateIssued.
     */
    public String getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets dateIssued.
     *
     * @param dateIssued The dateIssued.
     */
    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    /**
     * Gets place.
     *
     * @return The place.
     */
    public Place getPlace() {
        return place;
    }

    /**
     * Sets place.
     *
     * @param place The place.
     */
    public void setPlace(Place place) {
        this.place = place;
    }
}
