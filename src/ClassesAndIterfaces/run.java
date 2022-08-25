package ClassesAndIterfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class run {

    public static void main(String[] args) {
        Alien alien = new Alien("al23", "James");

        IAlien iAlien = new Alien("al23", "James");

//        iAlien.walk();
//        iAlien.run();

        Integer[] array = {2,4,6,7,8,5,3,4,7,5,2};

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

       




        String names = "Bonnie, James, Mercy, George, Simon";

        List<String> linkedlist = new LinkedList<>(Arrays.asList(names.split(",")));

        System.out.println(linkedlist);

     }
}
