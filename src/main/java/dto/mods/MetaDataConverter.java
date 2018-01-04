package dto.mods;

import java.util.List;

import org.dozer.DozerConverter;

import entities.Metadata;
import entities.Metadate;

public class MetaDataConverter extends DozerConverter<Metadata, String> {

    public MetaDataConverter() {
        super(Metadata.class,String.class);
    }

    public String convertTo(Metadata source,String destination) {
        String metadataType = getParameter();
        List<Metadate> metadataList = source.getMetadateList();

        for(Metadate metadata : metadataList) {
            if (metadata.getType().equals(metadataType)) {
                String result = metadata.getValue();
                return result;
            }
        }
        throw new IllegalStateException("Unknown value!");
    }

    public Metadata convertFrom(String source,Metadata destination) {
        return new Metadata();
    }
}

