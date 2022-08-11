package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesReader {
    public static void main(String[] args) {
        List commaseperated = new ArrayList();
        String mylist = "item1 , item2 , item3";
        commaseperated = Arrays.asList(mylist.trim().split(" , "));
        System.out.println(commaseperated.get(0));

        String PATH = "patients.db";


        getDetails(PATH);
    }

    private static void getDetails(String PATH){
        String name = "My name is Simon Wandera. What about you\n";

        try {
            FileWriter myWriter = new FileWriter(PATH, true);
            myWriter.write(name);
            myWriter.close();

            System.out.println("Successfully wrote to the file.\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
