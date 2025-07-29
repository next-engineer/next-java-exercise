package org.example.advaned.kimaram.unitseven.meal;

public class Meal {
    private final String mainDish;
    private final int calories;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String note;

    public Meal(MealBuilder builder) {
        this.mainDish = builder.mainDish;
        this.calories = builder.calories;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.note = builder.note;
    }

    // 요약 출력
    public void describe() {
        System.out.printf("메인 요리: %s, 칼로리: %d, 곁들임 요리: %s, 음료: %s, 후식: %s, 노트: %s%n",
                this.mainDish, this.calories, this.sideDish, this.drink,
                this.dessert, this.note);
    }

    public static class MealBuilder {
        private final String mainDish;
        private final int calories;
        private String sideDish;
        private String drink;
        private String dessert;
        private String note;

        public MealBuilder(String mainDish, int calories) {
            this.mainDish = mainDish;
            this.calories = calories;
        }

        public MealBuilder sideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public MealBuilder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public MealBuilder note(String note) {
            this.note = note;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
