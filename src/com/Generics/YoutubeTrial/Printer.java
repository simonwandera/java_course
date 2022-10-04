package com.Generics.YoutubeTrial;

public class Printer<T> {
    private T animal;

    public Printer(T animal) {
        this.animal = animal;
    }

    public void print(){
        System.out.println(animal);
    }

    public<F> void eat(F foodToEat){
        System.out.println(this.animal + "Is eating "+ foodToEat);
    }

}
