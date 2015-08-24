# wormsclient

WoRMS webservice client

## Features

The following operations are currently supported:

- getAphiaRecordsByNames
- matchAphiaRecordsByNames
- getAphiaRecords
- getAphiaSynonymsByID

## Usage

    WormsClient client = new WormsClient();
    ArrayList<String> names = new ArrayList<String>();
    names.add("Abra alba");
    names.add("Abergasilus amplexus");
    GetAphiaRecordsByNamesResponse response = client.getAphiaRecordsByNames(names);
