import be.pieterprovoost.wormsclient.client.WormsClient;
import be.pieterprovoost.wormsclient.model.GetAphiaIDResponse;
import be.pieterprovoost.wormsclient.model.GetAphiaRecordsByNamesResponse;
import be.pieterprovoost.wormsclient.model.GetAphiaRecordsResponse;
import be.pieterprovoost.wormsclient.model.MatchAphiaRecordsByNamesResponse;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;

public class WormsClientTest {

    final static Logger logger = Logger.getLogger(WormsClientTest.class);

    @Test
    public void testClient() {

        WormsClient client = new WormsClient();

        // getAphiaID

        GetAphiaIDResponse response1 = client.getAphiaId("Abra alba", false);

        // getAphiaRecordsByNames

        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Abra alba");
        names1.add("Lanice conchilega");
        names1.add("Abergasilus amplexus");
        GetAphiaRecordsByNamesResponse response2 = client.getAphiaRecordsByNames(names1);

        // matchAphiaRecordsByNames

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Abraa alba");
        MatchAphiaRecordsByNamesResponse response3 = client.matchAphiaRecordsByNames(names2);

        // getAphiaRecords

        GetAphiaRecordsResponse response4 = client.getAphiaRecords("Abra", true, false, false, 0);

        logger.info("");

    }

}
