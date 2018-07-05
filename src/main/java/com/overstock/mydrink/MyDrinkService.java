package com.overstock.mydrink;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by Jana on 7/5/2018.
 */
@Service
public class MyDrinkService {
    public MyDrink getMyDrink(String drinkName, String drinkType, String drinkSize) {
        MyDrink drink = new MyDrink();
        drink.setOrderId(String.valueOf(new Random().nextInt(9000000) + 1000000));
        drink.setName(drinkName);
        drink.setType(drinkType);
        drink.setSize(drinkSize);
        drink.setPrice("$14.23");
        drink.setWeight("112 Oz");
        drink.setCalories("54 cal");
        drink.setDescription("Good for you Health!!!");

        return drink;
    }
}
