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

    public GetAphiaRecordsByNamesRequest createGetAphiaRecordsByNamesRequest() {
        return new GetAphiaRecordsByNamesRequest();
    }

    public GetAphiaRecordsByNamesResponse createGetAphiaRecordsByNamesResponse() {
        return new GetAphiaRecordsByNamesResponse();
    }

    public GetAphiaRecordsRequest createGetAphiaRecordsRequest() {
        return new GetAphiaRecordsRequest();
    }

    public GetAphiaRecordsResponse createGetAphiaRecordsResponse() {
        return new GetAphiaRecordsResponse();
    }
}
