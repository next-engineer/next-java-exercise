package org.example.advaned.kimyoungji.unitseven.practice.meal;

public class MealTest {
    public static void main(String[] args) {
        Meal breakfast = new Meal.Builder("오트밀", 350)
                .sideDish("바나나")
                .drink("두유")
                .note("아침은 포만감 위주")
                .build();

        breakfast.describe();
    }
}
