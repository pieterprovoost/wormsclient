package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaIDResponse", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaIDResponse {

    @XmlElement(name="return")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
