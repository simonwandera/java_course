import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Map<String, String> hashMap = new HashMap<>(){{
            put("name", "Simon");
            put("age", "22");
            put("gender", "male");
        }};

        for (String s: hashMap.keySet()){
            System.out.println(s);
        }
    }


}