package CollectionsAndDataStructures;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToList {
    public void convert(){
        String[] motorbike={"Bajaj","Boxer","Honda","Yamaha", "Dukati"};
        System.out.println("printing Array: " + Arrays.toString(motorbike));

        List<String> list = new ArrayList<>();
        for (String bike: motorbike){
            list.add(bike);
        }

        System.out.println("Printing Arraylist: " + list);
    }
}
