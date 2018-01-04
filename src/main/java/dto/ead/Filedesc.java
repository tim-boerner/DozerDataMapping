package dto.ead;

public class Filedesc {
    private Titlestmt titlestmt;
    private Publicationstmt publicationstmt;

    /**
     * Gets titlestmt.
     *
     * @return The titlestmt.
     */
    public Titlestmt getTitlestmt() {
        return titlestmt;
    }

    /**
     * Sets titlestmt.
     *
     * @param titlestmt The titlestmt.
     */
    public void setTitlestmt(Titlestmt titlestmt) {
        this.titlestmt = titlestmt;
    }

    /**
     * Gets publicationstmt.
     *
     * @return The publicationstmt.
     */
    public Publicationstmt getPublicationstmt() {
        return publicationstmt;
    }

    /**
     * Sets publicationstmt.
     *
     * @param publicationstmt The publicationstmt.
     */
    public void setPublicationstmt(Publicationstmt publicationstmt) {
        this.publicationstmt = publicationstmt;
    }
}
