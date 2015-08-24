package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaMatches", namespace="http://aphia/v1.0")
@XmlType
public class AphiaMatches {

    private ArrayList<AphiaRecords> item = new ArrayList<AphiaRecords>();

    public ArrayList<AphiaRecords> getItem() {
        return item;
    }

    public void setItem(ArrayList<AphiaRecords> item) {
        this.item = item;
    }
}
