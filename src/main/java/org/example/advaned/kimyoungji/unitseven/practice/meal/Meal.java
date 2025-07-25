package org.example.advaned.kimyoungji.unitseven.practice.meal;

public class Meal {
    // 필수 필드
    private final String mainDish;
    private final int calories;

    // 선택 필드
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String note;

    private Meal(Builder builder) {
        this.mainDish = builder.mainDish;
        this.calories = builder.calories;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.note = builder.note;
    }

    public static class Builder {
        private final String mainDish;
        private final int calories;

        private String sideDish = "";
        private String drink = "";
        private String dessert = "";
        private String note = "";

        public Builder(String mainDish, int calories) {
            this.mainDish = mainDish;
            this.calories = calories;
        }

        public Builder sideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder note(String note) {
            this.note = note;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }

    public void describe() {
        System.out.println("식단 구성:");
        System.out.println("메인 요리: " + mainDish);
        System.out.println("칼로리: " + calories + " kcal");
        if (!sideDish.isEmpty()) System.out.println("사이드: " + sideDish);
        if (!drink.isEmpty()) System.out.println("음료: " + drink);
        if (!dessert.isEmpty()) System.out.println("디저트: " + dessert);
        if (!note.isEmpty()) System.out.println("비고: " + note);
    }
}
