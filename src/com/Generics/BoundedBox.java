package com.Generics;

public class BoundedBox <T>{
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e > elem)  // compiler error
                ++count;
        return count;
    }

    public static void main(String[] args) {
        BoundedBox<Integer> integerBox = new BoundedBox<Integer>();
        integerBox.set(new Integer(10));
//        integerBox.inspect("Some text"); // error: this is still String!
    }
}
