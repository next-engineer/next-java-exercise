package org.example.advaned.leehyemin.unitseven;

public class MealMain {
    public static void main(String[] args) {
        Meal breakfast=new Meal.MealBuilder("오트밀", 350)
                .sideDish("바나나")
                .drink("두유")
                .note("아침은 포만감 위주")
                .build();

        breakfast.describe();

        Meal lunch=new Meal.MealBuilder("김치찌개", 1000)
                .drink("아이스아메리카노")
                .note("점심은 일반식")
                .build();

        lunch.describe();
    }
}
