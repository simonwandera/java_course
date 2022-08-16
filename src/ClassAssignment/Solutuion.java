package ClassAssignment;

public class Solutuion {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));

        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb") );
        System.out.println(xyBalance("yaaxbb"));

        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));

    }

    private static String repeatSeparator(String word, String sep, int count){

        String bigString = "";
        for(int i=1; i<= count; i++){
            if(i==count){
                bigString = bigString.concat(word);
            }else {
                bigString = bigString.concat(word).concat(sep);
            }
        }
        return bigString;
    }

    private static Boolean xyBalance(String str) {

        int xLastPosition = 0;
        int yLastPosition = 0;

        for (int i = 0; i < str.toLowerCase().length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                xLastPosition = i;
            }
            if (str.toLowerCase().charAt(i) == 'y') {
                yLastPosition = i;
            }
        }

        if(yLastPosition > xLastPosition)
            return true;
        else
            return false;
    }

    private static Boolean prefixAgain(String str, int len){
        String withoutSub = str.substring(len);
        boolean isFound = withoutSub.contains(str.substring(0, len));
        if (isFound)
            return true;
        else
            return false;
    }

    
}
