package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractise {
    private Object object;
    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }

    public static void main(String[] args) {
//        The following code without generics requires casting
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
//        System.out.println(s);

//        When re-written to use generics, the code does not require casting:
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        String string = list1.get(0);   //no cast
        System.out.println(string);
    }


}
