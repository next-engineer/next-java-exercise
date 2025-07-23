package org.example.advaned.kimaram.unitseven.meal;

public class Main {
    public static void main(String[] args) {
        Meal breakfast = new Meal.MealBuilder("오트밀", 350)
                .sideDish("바나나")
                .drink("두유")
                .dessert("아몬드")
                .note("아침은 포만감 위주")
                .build();

        breakfast.describe();
    }
}
