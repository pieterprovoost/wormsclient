package be.pieterprovoost.wormsclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AphiaRecord", namespace="http://aphia/v1.0")
@XmlType
public class AphiaRecord {

    @XmlElement(name="AphiaID")
    private String aphiaID;

    @XmlElement(name="url")
    private String url;

    @XmlElement(name="scientificname")
    private String scientificname;

    @XmlElement(name="authority")
    private String authority;

    @XmlElement(name="rank")
    private String rank;

    @XmlElement(name="status")
    private String status;

    @XmlElement(name="unaccept_reason")
    private String unacceptReason;

    @XmlElement(name="valid_AphiaID")
    private Integer validAphiaID;

    @XmlElement(name="valid_name")
    private String validName;

    @XmlElement(name="valid_authority")
    private String validAuthority;

    @XmlElement(name="kingdom")
    private String kingdom;

    @XmlElement(name="phylum")
    private String phylum;

    @XmlElement(name="class")
    @SerializedName("class")
    private String classis;

    @XmlElement(name="order")
    private String order;

    @XmlElement(name="family")
    private String family;

    @XmlElement(name="genus")
    private String genus;

    @XmlElement(name="citation")
    private String citation;

    @XmlElement(name="lsid")
    private String lsid;

    @XmlElement(name="isMarine")
    private Boolean isMarine;

    @XmlElement(name="isBrackish")
    private Boolean isBrackish;

    @XmlElement(name="isFreshwater")
    private Boolean isFreshwater;

    @XmlElement(name="isTerrestrial")
    private Boolean isTerrestrial;

    @XmlElement(name="isExtinct")
    private Boolean isExtinct;

    @XmlElement(name="match_type")
    private String matchType;

    @XmlElement(name="modified")
    private Date modified;

    public String getAphiaID() {
        return aphiaID;
    }

    public void setAphiaID(String aphiaID) {
        this.aphiaID = aphiaID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScientificname() {
        return scientificname;
    }

    public void setScientificname(String scientificname) {
        this.scientificname = scientificname;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnacceptReason() {
        return unacceptReason;
    }

    public void setUnacceptReason(String unacceptReason) {
        this.unacceptReason = unacceptReason;
    }

    public Integer getValidAphiaID() {
        return validAphiaID;
    }

    public void setValidAphiaID(Integer validAphiaID) {
        this.validAphiaID = validAphiaID;
    }

    public String getValidName() {
        return validName;
    }

    public void setValidName(String validName) {
        this.validName = validName;
    }

    public String getValidAuthority() {
        return validAuthority;
    }

    public void setValidAuthority(String validAuthority) {
        this.validAuthority = validAuthority;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getClassis() {
        return classis;
    }

    public void setClassis(String classis) {
        this.classis = classis;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getLsid() {
        return lsid;
    }

    public void setLsid(String lsid) {
        this.lsid = lsid;
    }

    public Boolean getIsMarine() {
        return isMarine;
    }

    public void setIsMarine(Boolean isMarine) {
        this.isMarine = isMarine;
    }

    public Boolean getIsBrackish() {
        return isBrackish;
    }

    public void setIsBrackish(Boolean isBrackish) {
        this.isBrackish = isBrackish;
    }

    public Boolean getIsFreshwater() {
        return isFreshwater;
    }

    public void setIsFreshwater(Boolean isFreshwater) {
        this.isFreshwater = isFreshwater;
    }

    public Boolean getIsTerrestrial() {
        return isTerrestrial;
    }

    public void setIsTerrestrial(Boolean isTerrestrial) {
        this.isTerrestrial = isTerrestrial;
    }

    public Boolean getIsExtinct() {
        return isExtinct;
    }

    public void setIsExtinct(Boolean isExtinct) {
        this.isExtinct = isExtinct;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
