package org.parallel.utils.misc;

import com.google.common.io.Files;
import com.google.gson.*;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;

import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import io.restassured.path.json.JsonPath;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JsonUtils {

    private static final Logger logger = LogManager.getLogger(JsonUtils.class);
    public static void storeJSONFile(String response, String fileName) {

        try {
            // Converting in to byte array before writing
            byte[] responseAsStringByte = response.getBytes();

            File targetFileForByteArray = new File(System.getProperty("user.dir") + File.separator + "src/test/resources/TestData/Jsons/"+fileName);
            // Writing into files
            Files.write(responseAsStringByte, targetFileForByteArray);
        }catch (Exception ae){

        }


    }

    public static String getValue(String jsonResponse,String key){
         return JsonPath.from(jsonResponse).getString(key);

    }

    public static String getJSONDataFromJsonFile(String fileName){

        JsonPath jsonPath = JsonPath.from(System.getProperty("user.dir") + File.separator + "src/test/resources/TestData/Jsons/"+fileName+".json");
        return jsonPath.prettyPrint();
    }
}
