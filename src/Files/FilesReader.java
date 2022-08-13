package Files;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilesReader {
    public static void main(String[] args) throws IOException {
        System.out.println("\n################################################################");
        System.out.println("                             WELCOME                             ");
        System.out.println("################################################################\n\n");

        String PATH = "patients.db";
        MainMenu(PATH);
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

    private static void getDetails(String PATH) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Boolean addNew = true;
        while (addNew ){
            System.out.println("Enter your ID number: ");
            String idNumber = bufferedReader.readLine();

            System.out.println("What is your name: ");
            String name = bufferedReader.readLine();

            System.out.println("What is your gender(M/F): ");
            String gender = bufferedReader.readLine();

            System.out.println("Enter date of birth (YYYYMMDD): ");
            String dateOfBirth = bufferedReader.readLine();

            System.out.println("What is your health condition: ");
            String healthCondition = bufferedReader.readLine();

            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("YYYYMMdd");
            String today = LocalDate.now().format(myFormatObj);
            LocalDate dob = LocalDate.parse(dateOfBirth, myFormatObj.BASIC_ISO_DATE);
            String patient = idNumber + "," + name + "," + gender + "," + dob.format(myFormatObj) + "," + healthCondition + ',' + today + '\n';
            writeToFile(PATH, patient);
            System.out.println("<< Patient Saved Successfully >>");

            System.out.println("Do you wish to add another? (Y/N)");
            String add = bufferedReader.readLine();

            if (add.equals("N")){
                addNew = false;
            }else if (add.equals("Y")){
                addNew = true;
            }else {
                System.out.println("Invalid Response!");
                break;
            }
        }
        MainMenu(PATH);
    }
    private static ArrayList<ArrayList<String>> readFile(String PATH){
        ArrayList<ArrayList<String>> allPatients = new ArrayList();
        try {
            File myObj = new File(PATH);
            Scanner myReader = new Scanner(myObj);
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
        return allPatients;
    }

    private static void getAllPatients(String PATH) throws IOException {
        ArrayList<ArrayList<String>> allPatients = readFile(PATH);
        int count = 0;
        for(int i=0; i < allPatients.size(); i++){
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("YYYY-MM-dd");
            LocalDate dateOfBirth = LocalDate.parse((allPatients.get(i).get(3)), myFormatObj.BASIC_ISO_DATE);
            LocalDate dateOfVisit = LocalDate.parse((allPatients.get(i).get(5)), myFormatObj.BASIC_ISO_DATE);

            System.out.println("ID Number : " + allPatients.get(i).get(0));
            System.out.println("Name : " + allPatients.get(i).get(1));
            System.out.println("Gender : " + allPatients.get(i).get(2));
            System.out.println("Date of Birth : " + dateOfBirth);
            System.out.println("Health Condition : " + allPatients.get(i).get(4));
            System.out.println("Date of visit : " + dateOfVisit);
            System.out.println("**********************************************\n");
            count++;
        }
        if (count == 0){
            System.out.println("############### NO DATA TO DISPLAY ###############");
        }

        MainMenu(PATH);

    }

    private static void filterByDate(String PATH) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter Date in this format - YYYYMMDD");
        String dateString = bufferedReader.readLine();

        ArrayList<ArrayList<String>> allPatients = readFile(PATH);

        int count = 0;
        for(int i=0; i < allPatients.size(); i++){
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("YYYY-MM-dd");
            LocalDate dateOfBirth = LocalDate.parse((allPatients.get(i).get(3)), myFormatObj.BASIC_ISO_DATE);
            LocalDate dateOfVisit = LocalDate.parse((allPatients.get(i).get(5)), myFormatObj.BASIC_ISO_DATE);
            LocalDate searchDate = LocalDate.parse(dateString, myFormatObj.BASIC_ISO_DATE);

            if (dateOfVisit.equals(searchDate)){
                System.out.println("ID Number : " + allPatients.get(i).get(0));
                System.out.println("Name : " + allPatients.get(i).get(1));
                System.out.println("Gender : " + allPatients.get(i).get(2));
                System.out.println("Date of Birth : " + dateOfBirth);
                System.out.println("Health Condition : " + allPatients.get(i).get(4));
                System.out.println("Date of visit : " + dateOfVisit);
                System.out.println("******************** **************************\n");
                count = count + 1;
            }
        }

       if (count == 0){
           System.out.println("############### NO DATA TO DISPLAY ###############");
       }

       MainMenu(PATH);
    }

    private static void MainMenu(String PATH) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please select an option from the Menu below \n");
        System.out.println("R -> Register new Patient");
        System.out.println("A -> View all Patients");
        System.out.println("F -> Filter Patients records");
        System.out.println("X -> Exit Program");

        String Option = bufferedReader.readLine();

        if(Option.toLowerCase().equals("r")){
            System.out.println("New Patient \n");
            getDetails(PATH);
        }else if (Option.toLowerCase().equals("a")){
            System.out.println("All Patients \n");
            getAllPatients(PATH);
        }else if (Option.toLowerCase().equals("f")){
            System.out.println("All Patients \n");
            filterByDate(PATH);
        }else if (Option.toLowerCase().equals("x")){
            System.out.println("Exiting... \n");
            System.exit(2);

        }else {
            System.out.println("The Option you selected was not recognized!! \n");
        }
    }

    private static void FilterMenu(String PATH) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please select an option from the Menu below \n");
        System.out.println("FI -> Filter by ID");
        System.out.println("FV -> Filter by date of Visit");
        System.out.println("FG -> Filter by gender");
        System.out.println("FB -> Filter date of birth");
        System.out.println("MM -> Main menu");

        String Option = bufferedReader.readLine();

        if(Option.toLowerCase().equals("r")){
            System.out.println("New Patient \n");
            getDetails(PATH);
        }else if (Option.toLowerCase().equals("a")){
            System.out.println("All Patients \n");
            getAllPatients(PATH);
        }else if (Option.toLowerCase().equals("f")){
            System.out.println("All Patients \n");
            filterByDate(PATH);
        }else if (Option.toLowerCase().equals("x")){
            System.out.println("Exiting... \n");
            System.exit(2);

        }else {
            System.out.println("The Option you selected was not recognized!! \n");
        }
    }
}
