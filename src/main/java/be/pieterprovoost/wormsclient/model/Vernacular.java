package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="vernacular", namespace="http://aphia/v1.0")
@XmlType
public class Vernacular {

    @XmlElement(name="vernacular")
    private String vernacular;

    @XmlElement(name="language_code")
    private String languageCode;

    @XmlElement(name="language")
    private String language;

    public String getVernacular() {
        return vernacular;
    }

    public void setVernacular(String vernacular) {
        this.vernacular = vernacular;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
