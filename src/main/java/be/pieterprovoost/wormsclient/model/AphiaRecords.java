package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaRecords", namespace="http://aphia/v1.0")
@XmlType
public class AphiaRecords {

    @XmlElement(name="item")
    private ArrayList<AphiaRecord> records = new ArrayList<AphiaRecord>();

    public ArrayList<AphiaRecord> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<AphiaRecord> records) {
        this.records = records;
    }
}
