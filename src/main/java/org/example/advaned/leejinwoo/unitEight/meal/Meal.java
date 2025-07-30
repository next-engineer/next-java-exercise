package org.example.advaned.leejinwoo.unitEight.meal;

public class Meal {
    private final String mainDish;
    private final int calories;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String note;

    public Meal(MealBuilder mealBuilder) {
        this.mainDish = mealBuilder.mainDish;
        this.calories = mealBuilder.calories;
        this.sideDish = mealBuilder.sideDish;
        this.drink = mealBuilder.drink;
        this.dessert = mealBuilder.dessert;
        this.note = mealBuilder.note;
    }

    public String getMainDish() {return mainDish; }
    public int getCalories() {return calories; }
    public String getSideDish() {return sideDish; }
    public String getDrink() {return drink; }
    public String getDessert() {return dessert; }
    public String getNote() {return note; }

    public void describe(){
        System.out.println("mainDish : " + mainDish);
        System.out.println("calories : " + calories);
        System.out.println("sideDish : " + sideDish);
        System.out.println("drink : " + drink);
        System.out.println("dessert : " + dessert);
        System.out.println("note : " + note);
    }

    public static class MealBuilder{
        private final String mainDish;
        private final int calories;
        private String sideDish;
        private String drink;
        private String dessert;
        private String note;

        public MealBuilder(String mainDish, int calories){
            this.mainDish = mainDish;
            this.calories = calories;
        }

        public MealBuilder sideDish(String sideDish){
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder drink(String drink){
            this.drink = drink;
            return this;
        }

        public MealBuilder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public MealBuilder note(String note){
            this.note = note;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }

    }
}
