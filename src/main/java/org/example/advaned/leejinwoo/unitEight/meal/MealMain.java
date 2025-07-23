package org.example.advaned.leejinwoo.unitEight.meal;

public class MealMain {
    public static void main(String[] args) {
        Meal breakFast = new Meal.MealBuilder("오트밀", 350)
                .sideDish("바나나")
                .drink("두유")
                .note("아침은 포만감 위주")
                .build();

        breakFast.describe();
    }
}
