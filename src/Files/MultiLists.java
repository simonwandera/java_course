package Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiLists {

    public static void main(String[] args) {

        String data0 = "Mazda, Toyota, Lexus, Dakuti, Lamboghini";
        String data1 = "Dell, Hp, Acer, Lenovo";
        String data3 = "Mango, Beatroot, Grapes, Pineaples";



        ArrayList<String> cars = new ArrayList<String>(Arrays.asList(data0.split(",")));
        ArrayList<String> computers = new ArrayList<String>(Arrays.asList(data1.split(",")));
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList(data1.split(",")));




        System.out.println("cars = " + cars);
        System.out.println("Array size = " + cars.size());


        for(int i = 0; i < cars.size(); i++){
            System.out.println(" item = " + cars.get(i));
        }


    }
}
