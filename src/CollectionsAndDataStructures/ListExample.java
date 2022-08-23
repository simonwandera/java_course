package CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class ListExample {
    List<String> list1= new ArrayList();
    List <String> list2 = new LinkedList();
    List <String> list3 = new Vector();
    List <String> list4 = new Stack();

    private void addtoArraylit(String st){
        list1.add(st);
    }

    public List<String> getList1() {
        return list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public List<String> getList3() {
        return list3;
    }

    public List<String> getList4() {
        return list4;
    }
}
