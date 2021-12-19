package utils;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

public class JsonPropertiesUtil {

    private static JsonPath appConfigJp = new JsonPath(new File("src/main/resources/configs/appConfig.json"));
    private static JsonPath userConfigJp = new JsonPath(new File("src/main/resources/configs/userConfig.json"));

    public static String getAppUrl(String appName) {
        try {
//            JsonPath jsonPath = new JsonPath(new File("src/main/resources/configs/appConfig.json"));
            List<Object> appList = appConfigJp.getList("apps.app");
            for (Object app : appList) {
                Object name = ((LinkedHashMap) app).get("name");
                if (name.toString().equals(appName)) {
                    return (String) ((LinkedHashMap) app).get("url");
                }
            }

        } catch (ClassCastException classCastException) {
            System.out.println("NOT able to read config file: appConfig.json");
            classCastException.printStackTrace();
        }
        throw new IllegalArgumentException("AppName is not present in the config");
    }

    public static String getUserEmail(String userId) {
        try {
//            JsonPath jsonPath = new JsonPath(new File("src/main/resources/configs/userConfig.json"));
            List<Object> appList = userConfigJp.getList("users.user");
            for (Object app : appList) {
                Object name = ((LinkedHashMap) app).get("id");
                if (name.toString().equals(userId)) {
                    return (String) ((LinkedHashMap) app).get("email");
                }
            }

        } catch (ClassCastException classCastException) {
            System.out.println("NOT able to read config file: appConfig.json");
            classCastException.printStackTrace();
        }
        throw new IllegalArgumentException("AppName is not present in the config");
    }

    public static String getUserPassword(String userId) {
        try {
//            JsonPath jsonPath = new JsonPath(new File("src/main/resources/configs/userConfig.json"));
            List<Object> appList = userConfigJp.getList("users.user");
            for (Object app : appList) {
                Object name = ((LinkedHashMap) app).get("id");
                if (name.toString().equals(userId)) {
                    return (String) ((LinkedHashMap) app).get("password");
                }
            }

        } catch (ClassCastException classCastException) {
            System.out.println("NOT able to read config file: appConfig.json");
            classCastException.printStackTrace();
        }
        throw new IllegalArgumentException("AppName is not present in the config");
    }


}
