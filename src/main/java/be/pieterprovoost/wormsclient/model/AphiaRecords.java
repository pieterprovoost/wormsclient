package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaRecords", namespace="http://aphia/v1.0")
@XmlType
public class AphiaRecords {

    private ArrayList<AphiaRecord> item = new ArrayList<AphiaRecord>();

    public ArrayList<AphiaRecord> getItem() {
        return item;
    }

    public void setItem(ArrayList<AphiaRecord> item) {
        this.item = item;
    }
}
