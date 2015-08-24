package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="matchAphiaRecordsByNames", namespace="http://aphia/v1.0")
@XmlType
public class MatchAphiaRecordsByNamesRequest {

    @XmlElement(name="scientificnames")
    private ScientificNames scientificNames;

    @XmlElement(name="marine_only")
    private Boolean marineOnly;

    public ScientificNames getScientificNames() {
        if (scientificNames == null) {
            scientificNames = new ScientificNames();
        }
        return scientificNames;
    }

    public void setScientificNames(ScientificNames scientificNames) {
        this.scientificNames = scientificNames;
    }

    public Boolean getMarineOnly() {
        return marineOnly;
    }

    public void setMarineOnly(Boolean marineOnly) {
        this.marineOnly = marineOnly;
    }
}
