package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="scientificnames", namespace="http://aphia/v1.0")
@XmlType
public class ScientificNames {

    @XmlElement(name="item")
    private ArrayList<String> names = new ArrayList<String>();

    @XmlAttribute
    public final String arrayType = "xsd:string[]";

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

}