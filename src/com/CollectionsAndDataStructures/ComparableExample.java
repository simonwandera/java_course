package com.CollectionsAndDataStructures;

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
}

public class ComparableExample {

    private void sortMeals(){

    }

}
