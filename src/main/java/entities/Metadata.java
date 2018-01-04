package entities;

import java.util.LinkedList;
import java.util.List;

public class Metadata {

    private List<Metadate> metadateList = new LinkedList<>();

    /**
     * Gets metadateList.
     *
     * @return The metadateList.
     */
    public List<Metadate> getMetadateList() {
        return metadateList;
    }

    /**
     * Sets metadateList.
     *
     * @param metadateList The metadateList.
     */
    public void setMetadateList(List<Metadate> metadateList) {
        this.metadateList = metadateList;
    }
}
