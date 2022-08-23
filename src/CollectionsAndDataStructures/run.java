package CollectionsAndDataStructures;

import java.util.Iterator;

public class run {
    public static void main(String[] args) {
        ListExample listExample = new ListExample();
        for(int i = 0; i < 50; i++){
            listExample.addtoArraylist1("Added" + i);
        }

//        for (int j = 0; j < listExample.list1.size(); j++){
//            System.out.println(j);
//        }

        Iterator itr = listExample.list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
