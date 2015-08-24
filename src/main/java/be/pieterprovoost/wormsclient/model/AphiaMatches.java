package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaMatches", namespace="http://aphia/v1.0")
@XmlType
public class AphiaMatches {

    @XmlElement(name="item")
    private ArrayList<AphiaRecords> matches = new ArrayList<AphiaRecords>();

    public ArrayList<AphiaRecords> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<AphiaRecords> matches) {
        this.matches = matches;
    }
}
