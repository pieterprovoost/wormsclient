package be.pieterprovoost.wormsclient.model;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public GetAphiaIDRequest createGetAphiaIdRequest() {
        return new GetAphiaIDRequest();
    }

    public GetAphiaIDResponse createGetAphiaIdResponse() {
        return new GetAphiaIDResponse();
    }

    public GetAphiaSynonymsByIDRequest createGetAphiaSynonymsByIDRequest() {
        return new GetAphiaSynonymsByIDRequest();
    }

    public GetAphiaSynonymsByIDResponse createGetAphiaSynomymsByIdResponse() {
        return new GetAphiaSynonymsByIDResponse();
    }

    public GetAphiaRecordsByNamesRequest createGetAphiaRecordsByNamesRequest() {
        return new GetAphiaRecordsByNamesRequest();
    }

    public GetAphiaRecordsByNamesResponse createGetAphiaRecordsByNamesResponse() {
        return new GetAphiaRecordsByNamesResponse();
    }

    public MatchAphiaRecordsByNamesRequest createMatchAphiaRecordsByNamesRequest() {
        return new MatchAphiaRecordsByNamesRequest();
    }

    public MatchAphiaRecordsByNamesResponse createMatchAphiaRecordsByNamesResponse() {
        return new MatchAphiaRecordsByNamesResponse();
    }

    public GetAphiaRecordsRequest createGetAphiaRecordsRequest() {
        return new GetAphiaRecordsRequest();
    }

    public GetAphiaRecordsResponse createGetAphiaRecordsResponse() {
        return new GetAphiaRecordsResponse();
    }
}
