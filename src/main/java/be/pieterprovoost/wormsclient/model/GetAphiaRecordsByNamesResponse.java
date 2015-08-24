package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaRecordsByNamesResponse", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaRecordsByNamesResponse {

    @XmlElement(name="return")
    private AphiaMatches aphiaMatches;

    public AphiaMatches getAphiaMatches() {
        return aphiaMatches;
    }

    public void setAphiaMatches(AphiaMatches aphiaMatches) {
        this.aphiaMatches = aphiaMatches;
    }
}
