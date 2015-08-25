package be.pieterprovoost.wormsclient.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ResponseSerializer {

    public static String serialize(Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(o);
    }

}