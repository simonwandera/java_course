package com.FinalDay;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] testArray = {"c", "a", "a"};
        System.out.println(wordMultiple(testArray));
    }

    public static Map<String, Boolean> wordMultiple(String[] array){

        Map<String, Boolean> occurences = new HashMap<>();

        Set<String> hashSet = new HashSet<>(Arrays.asList(array));
        List<String> listArray = new ArrayList<>(Arrays.asList(array));

        for (String str: hashSet){
            if (Collections.frequency(listArray, str) > 1)
                occurences.put(str, true);
            else
                occurences.put(str, false);
        }
        return occurences;
    }
}
