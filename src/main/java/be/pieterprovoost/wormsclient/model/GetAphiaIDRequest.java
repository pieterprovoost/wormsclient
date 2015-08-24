package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaID", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaIDRequest {

    @XmlElement(name="scientificname")
    private String scientificname;

    @XmlElement(name="marine_only")
    private Boolean marineOnly;

    public String getScientificname() {
        return scientificname;
    }

    public void setScientificname(String scientificname) {
        this.scientificname = scientificname;
    }

    public Boolean getMarineOnly() {
        return marineOnly;
    }

    public void setMarineOnly(Boolean marineOnly) {
        this.marineOnly = marineOnly;
    }
}
