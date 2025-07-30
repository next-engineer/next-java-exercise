package org.example.advaned.yunbyeongchang.unitseven.homework.meal;

import java.util.ArrayList;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        ArrayList<Meal> meals = new ArrayList<>();
        meals.add(new Meal.MealBuilder("오트밀", 67)
                        .sideDish("바나나")
                        .drink("우유")
                        .note("아침은 포만감 위주")
                        .build());

        meals.add(new Meal.MealBuilder("감자탕", 375)
                .sideDish("볶음밥")
                .drink("콜라")
                .dessert("아이스크림")
                .note("다이어트 포기하셨죠?")
                .build());

        for(Meal meal: meals)
        {
            meal.describe();
        }
    }
}
