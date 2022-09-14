package com.Generics.MultipleTypeParams;

public class Pairr<K, V> {
    private K key;
    private V value;

    public Pairr(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }

    public static void main(String[] args) {
        Pairr<Integer, String> p1 = new Pairr<>(1, "apple");
        Pairr<Integer, String> p2 = new Pairr<>(2, "pear");

        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}
