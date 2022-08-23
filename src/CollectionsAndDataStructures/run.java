package CollectionsAndDataStructures;

public class run {
    public static void main(String[] args) {
        ListExample listExample = new ListExample();
        for(int i = 0; i < 50; i++){
            listExample.addtoArraylist1("Added" + i);
        }

        for (int j = 0; j < listExample.list1.size(); j++){
            System.out.println(j);
        }
    }
}
