package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesReader {
    public static void main(String[] args) {
        List commaseperated = new ArrayList();
        String mylist = "item1 , item2 , item3";
        commaseperated = Arrays.asList(mylist.trim().split(" , "));
        System.out.println(commaseperated.get(0));

        String PATH = "patients.db";

        getDetails(PATH);

    }

    private static void writeToFile(String PATH){
        String name = "My name is Simon Wandera. What about you\n";

        try {
            FileWriter myWriter = new FileWriter(PATH, true);
            myWriter.write(name);
            myWriter.flush();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void getDetails(String PATH){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = sc.next();

        System.out.println("What is your gender(M/F): ");
        String gender = sc.next();

        System.out.println("Enter date of birth (DDMMYYY): ");
        String dateOfBirth = sc.next();

        System.out.println("What is your health condition: ");
        String healthCondition = sc.next();
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String today = LocalDate.now().format(myFormatObj);
        String patient = name + "," + gender + "," + dateOfBirth + "," + healthCondition + ',' + today;
        System.out.println("patient = " + patient);




    }
}
