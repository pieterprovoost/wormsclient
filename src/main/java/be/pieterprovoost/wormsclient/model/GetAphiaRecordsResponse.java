package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaRecordsResponse", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaRecordsResponse {

    @XmlElement(name="return")
    private AphiaRecords aphiaRecords;

    public AphiaRecords getAphiaRecords() {
        return aphiaRecords;
    }

    public void setAphiaRecords(AphiaRecords aphiaRecords) {
        this.aphiaRecords = aphiaRecords;
    }

}
