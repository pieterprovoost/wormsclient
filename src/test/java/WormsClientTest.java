import be.pieterprovoost.wormsclient.WormsClient;
import be.pieterprovoost.wormsclient.model.GetAphiaIDResponse;
import be.pieterprovoost.wormsclient.model.GetAphiaRecordsByNamesResponse;
import be.pieterprovoost.wormsclient.model.GetAphiaRecordsResponse;
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

        ArrayList<String> names = new ArrayList<String>();
        names.add("Abra alba");
        names.add("Lanice conchilega");
        names.add("Abergasilus amplexus");
        GetAphiaRecordsByNamesResponse response2 = client.getAphiaRecordsByNames(names);

        // getAphiaRecords

        GetAphiaRecordsResponse response3 = client.getAphiaRecords("Abra", true, false, false, 0);

        logger.info("");

    }

}
