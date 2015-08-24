# wormsclient

WoRMS webservice client for Java

## Features

The following operations are currently supported:

- getAphiaRecordsByNames
- matchAphiaRecordsByNames
- getAphiaRecords
- getAphiaSynonymsByID

## Usage

```java
WormsClient client = new WormsClient();

ArrayList<String> names = new ArrayList<String>();
names.add("Abra alba");
names.add("Abergasilus amplexus");
GetAphiaRecordsByNamesResponse response = client.getAphiaRecordsByNames(names);

String json = ResponseSerializer.serialize(response);
```

```json
{
  "aphiaMatches": {
    "matches": [
      {
        "records": [
          {
            "aphiaID": "141433",
            "url": "http://www.marinespecies.org/aphia.php?p\u003dtaxdetails\u0026id\u003d141433",
            "scientificname": "Abra alba",
            "authority": "(W. Wood, 1802)",
            "rank": "Species",
            "status": "accepted",
            "validAphiaID": 141433,
            "validName": "Abra alba",
            "validAuthority": "(W. Wood, 1802)",
            "kingdom": "Animalia",
            "phylum": "Mollusca",
            "class": "Bivalvia",
            "order": "Veneroida",
            "family": "Semelidae",
            "genus": "Abra",
            "citation": "Huber, M.; Gofas, S. (2015). Abra alba (W. Wood, 1802). In:  MolluscaBase (2015). Accessed through:  World Register of Marine Species at http://www.marinespecies.org/aphia.php?p\u003dtaxdetails\u0026id\u003d141433 on 2015-08-24",
            "lsid": "urn:lsid:marinespecies.org:taxname:141433",
            "isMarine": true,
            "matchType": "exact",
            "modified": "Sep 23, 2010 2:34:22 PM"
          }
        ]
      },
      {
        "records": [
          {
            "aphiaID": "348325",
            "url": "http://www.marinespecies.org/aphia.php?p\u003dtaxdetails\u0026id\u003d348325",
            "scientificname": "Abergasilus amplexus",
            "authority": "Hewitt, 1978",
            "rank": "Species",
            "status": "accepted",
            "validAphiaID": 348325,
            "validName": "Abergasilus amplexus",
            "validAuthority": "Hewitt, 1978",
            "kingdom": "Animalia",
            "phylum": "Arthropoda",
            "class": "",
            "order": "Poecilostomatoida",
            "family": "Ergasilidae",
            "genus": "Abergasilus",
            "citation": "Walter, T. Chad (2015). Abergasilus amplexus Hewitt, 1978. In: Walter, T.C. \u0026 Boxshall, G. (2015). World of Copepods database. Accessed through:  World Register of Marine Species at http://www.marinespecies.org/aphia.php?p\u003dtaxdetails\u0026id\u003d348325 on 2015-08-24",
            "lsid": "urn:lsid:marinespecies.org:taxname:348325",
            "isMarine": false,
            "isBrackish": false,
            "isFreshwater": true,
            "isTerrestrial": false,
            "matchType": "exact",
            "modified": "Jul 15, 2008 6:41:49 PM"
          }
        ]
      }
    ]
  }
}
```
