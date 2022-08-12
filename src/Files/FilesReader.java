package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
        getAllPatients(PATH);
        getDetails(PATH);


    }

    private static void writeToFile(String PATH, String str){
        try {
            FileWriter myWriter = new FileWriter(PATH, true);
            myWriter.write(str);
            myWriter.flush();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void getDetails(String PATH){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID number: ");
        String idNumber = sc.next();

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
        String patient = idNumber + "," + name + "," + gender + "," + dateOfBirth + "," + healthCondition + ',' + today + '\n';
        System.out.println("patient = " + patient);
        writeToFile(PATH, patient);
    }

    private static void getAllPatients(String PATH){
        ArrayList<ArrayList<String>> allPatients = new ArrayList();
        try {
            File myObj = new File(PATH);
            Scanner myReader = new Scanner(myObj);
//            List allPatients = new ArrayList();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ArrayList<String> myList = new ArrayList<String>(Arrays.asList(data.trim().split(",")));
                allPatients.add(myList);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int row = 0; row < allPatients.size(); row++) {
            
            List singlePatient = new ArrayList(List.of(allPatients.get(row)));

            for(int i=0; i < allPatients.size(); i++){
                for (int j=0; j<allPatients.get(i).size(); j++){
                    System.out.println("Single items = " + allPatients.get(i).get(j));
                }
            }
            System.out.println("allPatients.get(row). = " + allPatients.get(row));
        }

//        System.out.println("allPatients.size() = " + allPatients.size());

    }
}
