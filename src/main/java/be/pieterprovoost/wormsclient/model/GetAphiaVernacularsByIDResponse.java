package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaVernacularsByIDResponse", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaVernacularsByIDResponse {

    @XmlElement(name="return")
    private AphiaVernaculars aphiaVernaculars;

    public AphiaVernaculars getAphiaVernaculars() {
        return aphiaVernaculars;
    }

    public void setAphiaVernaculars(AphiaVernaculars aphiaVernaculars) {
        this.aphiaVernaculars = aphiaVernaculars;
    }
}
