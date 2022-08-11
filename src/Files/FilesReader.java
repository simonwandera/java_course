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

//        Creating the file
        try{
            File myFile = new File("data.db");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void getDetails(){
        String name = "My name is Simon Wandera. What about you";
        File myFile = new File("filename.txt");


    }
}
