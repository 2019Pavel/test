package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Parser {
    public static List<String> getBrowserOptions(String pathToJsonFile, String key) {
        JSONArray options = (JSONArray) Objects.requireNonNull(getJsonObject(pathToJsonFile)).get(key);
        Iterator iterator = options.iterator();
        List<String> browserOptions = new ArrayList<>();

        while (iterator.hasNext()) {
            String browserOption = iterator.next().toString();

            browserOptions.add(browserOption);
        }
        return browserOptions;
    }

    public static String getValue(String pathToJsonFile, String key) {
        String value = String.valueOf(Objects.requireNonNull(getJsonObject(pathToJsonFile)).get(key));
        return value;
    }

    private static JSONObject getJsonObject(String pathToJsonFile) {
        try {
            FileReader reader = new FileReader(pathToJsonFile);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            return jsonObject;
        } catch (ParseException | IOException exception) { exception.printStackTrace(); }
        return null;
    }
}
