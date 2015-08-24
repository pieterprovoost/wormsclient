package be.pieterprovoost.wormsclient.client;

import be.pieterprovoost.wormsclient.model.*;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import java.util.ArrayList;

public class WormsClient extends WebServiceGatewaySupport {

    public WormsClient() {
        this.setDefaultUri("http://www.marinespecies.org/aphia.php?p=soap");
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("be.pieterprovoost.wormsclient.model");
        try {
            marshaller.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setMarshaller(marshaller);
        this.setUnmarshaller(marshaller);
    }

    public GetAphiaIDResponse getAphiaId(String name, boolean marineOnly) {
        GetAphiaIDRequest request = new GetAphiaIDRequest();
        request.setScientificname(name);
        request.setMarineOnly(marineOnly);
        return (GetAphiaIDResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAphiaIDResponse getAphiaId(String name) {
        return getAphiaId(name, false);
    }

    public GetAphiaRecordsByNamesResponse getAphiaRecordsByNames(ArrayList<String> names, boolean like, boolean fuzzy, boolean marineOnly) {
        GetAphiaRecordsByNamesRequest request = new GetAphiaRecordsByNamesRequest();
        request.setLike(like);
        request.setFuzzy(fuzzy);
        request.setMarineOnly(marineOnly);
        for (String name : names) {
            request.getScientificNames().getNames().add(name);
        }
        return (GetAphiaRecordsByNamesResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAphiaRecordsByNamesResponse getAphiaRecordsByNames(ArrayList<String> names) {
        return getAphiaRecordsByNames(names, false, false, false);
    }

    public GetAphiaRecordsByNamesResponse getAphiaRecordsByNames(String name, boolean like, boolean fuzzy, boolean marineOnly) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(name);
        return getAphiaRecordsByNames(names, like, fuzzy, marineOnly);
    }

    public GetAphiaRecordsResponse getAphiaRecords(String name, boolean like, boolean fuzzy, boolean marineOnly, int offset) {
        GetAphiaRecordsRequest request = new GetAphiaRecordsRequest();
        request.setLike(like);
        request.setFuzzy(fuzzy);
        request.setMarineOnly(marineOnly);
        request.setOffset(offset);
        request.setScientificName(name);
        return (GetAphiaRecordsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAphiaRecordsResponse getAphiaRecords(String name) {
        return getAphiaRecords(name, false, false, false, 0);
    }

    public MatchAphiaRecordsByNamesResponse matchAphiaRecordsByNames(ArrayList<String> names, boolean marineOnly) {
        MatchAphiaRecordsByNamesRequest request = new MatchAphiaRecordsByNamesRequest();
        request.setMarineOnly(marineOnly);
        for (String name : names) {
            request.getScientificNames().getNames().add(name);
        }
        return (MatchAphiaRecordsByNamesResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public MatchAphiaRecordsByNamesResponse matchAphiaRecordsByNames(ArrayList<String> names) {
        return matchAphiaRecordsByNames(names, false);
    }

    public GetAphiaSynonymsByIDResponse getAphiaSynonymsByID(int id) {
        GetAphiaSynonymsByIDRequest request = new GetAphiaSynonymsByIDRequest();
        request.setAphiaID(id);
        return (GetAphiaSynonymsByIDResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}