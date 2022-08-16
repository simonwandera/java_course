package ClassAssignment;

public class Solution {
    public static String repeatSeparator(String word, String sep, int count){
        String bigString = "";
        for(int i=1; i<= count; i++){
            if(i==count)
                bigString = bigString.concat(word);
            else
                bigString = bigString.concat(word).concat(sep);
        }
        return bigString;
    }
    public static Boolean xyBalance(String str) {

        int xLastPosition = 0;
        int yLastPosition = 0;

        for (int i = 0; i < str.toLowerCase().length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x')
                xLastPosition = i;
            if (str.toLowerCase().charAt(i) == 'y')
                yLastPosition = i;
        }

        if(yLastPosition > xLastPosition)
            return true;
        else
            return false;
    }

    public static Boolean prefixAgain(String str, int len){
        String withoutSub = str.substring(len);
        if (withoutSub.contains(str.substring(0, len)))
            return true;
        else
            return false;
    }

    public static String zipZap(String str){
        for(int i=0; i < (str.length()-2); i++){
            if((str.charAt(i) == 'z') && (str.charAt(i+2) == 'p'))
                str = str.replace(Character.toString(str.charAt(i+1)), "");
        }
        return str;
    }
}
