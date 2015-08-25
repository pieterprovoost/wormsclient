package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaVernaculars", namespace="http://aphia/v1.0")
@XmlType
public class AphiaVernaculars {

    @XmlElement(name="item")
    private ArrayList<Vernacular> vernaculars = new ArrayList<Vernacular>();

    public ArrayList<Vernacular> getVernaculars() {
        return vernaculars;
    }

    public void setVernaculars(ArrayList<Vernacular> vernaculars) {
        this.vernaculars = vernaculars;
    }
}
