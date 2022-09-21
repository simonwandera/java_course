package com.CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Meal implements Comparable<Meal>{
    private String mealName;
    private int orders;
    private String nutrients;

    public Meal(String mealName, String nutrients, int orders) {
        this.mealName = mealName;
        this.nutrients = nutrients;
        this.orders = orders;
    }

    @Override
    public int compareTo(Meal meal) {
        if(orders == meal.orders)
            return 0;
        else if (orders > meal.orders)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return mealName + "\t" + orders + "\t" + nutrients + "\n";
    }
}

public class ComparableExample {

    public void sortMeals(){
        List<Meal> mealList = new ArrayList<>();

        mealList.add(new Meal("Pizza", "Carbohydrate", 11));
        mealList.add(new Meal("pawpaw", "Vitamin", 23));
        mealList.add(new Meal("Chicken", "protein", 25));
        mealList.add(new Meal("Cupcake", "junk", 30));



        Collections.sort(mealList);
        System.out.println(mealList);



    }

}
