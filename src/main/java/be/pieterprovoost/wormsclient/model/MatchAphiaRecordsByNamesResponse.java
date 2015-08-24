package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="matchAphiaRecordsByNamesResponse", namespace="http://aphia/v1.0")
@XmlType
public class MatchAphiaRecordsByNamesResponse {

    @XmlElement(name="return")
    private AphiaMatches aphiaMatches;

    public AphiaMatches getAphiaMatches() {
        return aphiaMatches;
    }

    public void setAphiaMatches(AphiaMatches aphiaMatches) {
        this.aphiaMatches = aphiaMatches;
    }
}
