package entities;

public class Metadate {
    private String type;
    private String value;

    public Metadate(String type, String value) {
        this.type = type;
        this.value = value;
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
     * Gets value.
     *
     * @return The value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value The value.
     */
    public void setValue(String value) {
        this.value = value;
    }
}
