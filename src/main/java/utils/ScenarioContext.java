package utils;


import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    public static final ThreadLocal<Map<String, Object>> dataSet=new ThreadLocal<>();


    public static void setContext(String key, Object value) {
        Map<String,Object> scenarioContext=new HashMap<>();
        scenarioContext.put(key,value);
        dataSet.set(scenarioContext);
    }

    public static Object getContext(String key){
        return dataSet.get().get(key).toString();
    }

    public static Boolean isContains(String key){
        return dataSet.get().containsKey(key);
    }
}
