package java_scanners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Java_scanners {

    public static void main(String[] args) throws IOException {

        String dateOfBirth = "20220419";

        String date1 = "20220419";
        String date2 = "20220419";

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String today = LocalDate.now().format(myFormatObj);

        LocalDate my_date1 = LocalDate.parse(date1, myFormatObj.BASIC_ISO_DATE);
        LocalDate my_date2 = LocalDate.parse(date2, myFormatObj.BASIC_ISO_DATE);

        System.out.println("My date 1: " + my_date1);
        System.out.println("My date 2: " + my_date2);

        if (my_date1.equals(my_date2)){
            System.out.println("The two dates are equal");
        }
        LocalDate dob = LocalDate.parse(dateOfBirth, myFormatObj.BASIC_ISO_DATE);
        System.out.println("dob = " + dob);



        System.out.println(" Welcome to java Scanners ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("What is your name: ");
        String name = bufferedReader.readLine();
        System.out.println("How old are you");
        int age = bufferedReader.read();
        System.out.println("age = " + age);
        System.out.println("Name = " + name);
    }
}
