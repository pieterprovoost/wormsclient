package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="scientificnames", namespace="http://aphia/v1.0")
@XmlType
public class ScientificNames {

    private ArrayList<String> item = new ArrayList<String>();

    @XmlAttribute
    public final String arrayType = "xsd:string[]";

    public ArrayList<String> getItem() {
        return item;
    }

    public void setItem(ArrayList<String> item) {
        this.item = item;
    }
}