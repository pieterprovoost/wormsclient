package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaRecordsByNames", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaRecordsByNamesRequest {

    @XmlElement(name="scientificnames")
    private ScientificNames scientificNames;

    @XmlElement(name="like")
    private Boolean like;

    @XmlElement(name="fuzzy")
    private Boolean fuzzy;

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

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public Boolean getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(Boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    public Boolean getMarineOnly() {
        return marineOnly;
    }

    public void setMarineOnly(Boolean marineOnly) {
        this.marineOnly = marineOnly;
    }
}
