package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaIDResponse", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaIDResponse {

    @XmlElement(name="return")
    private Integer aphiaID;

    public Integer getAphiaID() {
        return aphiaID;
    }

    public void setAphiaID(Integer aphiaID) {
        this.aphiaID = aphiaID;
    }
}
