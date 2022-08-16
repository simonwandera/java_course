package ClassAssignment;

public class Main {
    public static void main(String[] args) {
        Solutuion mySolution = new Solutuion();

        System.out.println(mySolution.repeatSeparator("Word", "X", 3));
        System.out.println(mySolution.repeatSeparator("This", "And", 2));
        System.out.println(mySolution.repeatSeparator("This", "And", 1));

        System.out.println(mySolution.xyBalance("aaxbby"));
        System.out.println(mySolution.xyBalance("aaxbb") );
        System.out.println(mySolution.xyBalance("yaaxbb"));

        System.out.println(mySolution.prefixAgain("abXYabc", 1));
        System.out.println(mySolution.prefixAgain("abXYabc", 2));
        System.out.println(mySolution.prefixAgain("abXYabc", 3));

        System.out.println(mySolution.zipZap("zipXzap"));
        System.out.println(mySolution.zipZap("zopzop"));
        System.out.println(mySolution.zipZap("zzzopzop"));


//        System.out.println("skipped".charAt(0));
    }
}
