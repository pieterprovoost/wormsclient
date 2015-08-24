package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getAphiaRecords", namespace="http://aphia/v1.0")
@XmlType
public class GetAphiaRecordsRequest {

    @XmlElement(name="scientificname")
    private String scientificName;

    @XmlElement(name="like")
    private Boolean like;

    @XmlElement(name="fuzzy")
    private Boolean fuzzy;

    @XmlElement(name="marine_only")
    private Boolean marineOnly;

    @XmlElement(name="offset")
    private Integer offset;

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
