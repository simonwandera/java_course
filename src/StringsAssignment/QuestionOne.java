package StringsAssignment;

import java.util.*;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));

        System.out.println(left2("melody"));
        System.out.println(left2("Hello"));

        System.out.println(deFront("absent"));
        System.out.println(deFront("corel"));

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "i"));


        int[] myarray = {8, 6, 7, 5, 3, 0, 9};
        System.out.println(midThree(myarray));

        System.out.println(maxTriple(myarray));

    }

//    =====================QuestionOne====================
    private static String without2(String str){
        String first_two_substring = str.substring(0,2), new_substring;
        int length = str.length();
        String last_two_substring = str.substring(length-2);
        if(first_two_substring.equals(last_two_substring)){
            return str.substring( 2);
        } else {
            return str;
        }
    }

    //    =====================QuestionTwo====================
    private static String left2(String str){

        String first_two_substrings = str.substring(0, 2);
        String without_sub = str.substring(2);
        String final_string = without_sub.concat(first_two_substrings);

       return final_string;
    }

    //    =====================QuestionThree====================

    private static String deFront(String str){
        String defronted = str.substring(2);
        String first_letter = Character.toString(str.charAt(0));
        String second_letter = Character.toString(str.charAt(1));

        String prefix = "";
        if(first_letter.equals("a")){
            prefix = prefix.concat("a");
        }

        if (second_letter.equals("b")) {
            prefix = prefix.concat("b");
        }

        return prefix.concat(defronted);
    }

    //    =====================QuestionFour====================

    private static String startWord(String str, String word){

        int string_length = str.length();
        int word_length = word.length();

        String first_letters = str.substring(0, word_length);
        if(word_length > string_length){
            return str;
        } else {
            return first_letters;
        }
    }

    //    =====================QuestionFive======================
    private static String midThree(int[] array){
        int middle_index = (array.length - 1)/2;
        int[] final_array = { array[middle_index - 1], array[middle_index], array[middle_index + 1] };
        return Arrays.toString(final_array);

    }


    //    =====================QuestionSix====================
    private static int maxTriple(int[] array){

        int first_element = array[0];
        int middle_element = array[(array.length - 1)/2];

        int last_element = array[array.length-1];

       int[] new_array = {first_element, middle_element, last_element};

       int max = new_array[0];
        for(int i=0; i< new_array.length; i++){
            if(new_array[i] > max ){max = new_array[i];}
        }

        return max;
    }


}