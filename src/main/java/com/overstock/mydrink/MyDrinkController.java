package com.overstock.mydrink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by Jana on 7/5/2018.
 */
@RestController
@RequestMapping(value="/drink")
public class MyDrinkController {

    @Autowired
    MyDrinkService myDrinkService;

//    public void setMyDrinkService(MyDrinkService myDrinkService) {
//        this.myDrinkService = myDrinkService;
//    }

    @GetMapping
    public MyDrink getMyDrink(@RequestParam("drinkName") String drinkName, @RequestParam("drinkType") String drinkType,
                             @RequestParam("drinkSize") String drinkSize) {
        return myDrinkService.getMyDrink(drinkName, drinkType, drinkSize);
    }
}
