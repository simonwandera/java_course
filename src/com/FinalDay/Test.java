
package com.FinalDay;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] testArray = {"c", "a", "a"};
        String[] swapElemets = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
//        System.out.println(wordMultiple(testArray));

        System.out.println(Arrays.toString(swapElemets));
        System.out.println(Arrays.toString(allSwap(swapElemets)));

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

    /*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

    allSwap(["ab", "ac"]) → ["ac", "ab"]
    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */
    //    String[] swapElemets = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
    public static String[] allSwap(String[] elements){

        for(int i = elements.length; i> 0; i--) {
            String stringA = elements[i];
            for (int j = i+1; j< elements.length; j++){
                String stringB = elements[j];

                if(stringA.charAt(0) == stringB.charAt(0)) {
                    String temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                    break;
                }
            }
        }
        return elements;
    }
}
