package org.example.advaned.leehyemin.unitseven;

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

    public void describe() {
        System.out.println("< 식단 출력 >");
        System.out.println("메인 음식 : "+mainDish);
        System.out.println("칼로리 : "+calories+"kcal");
        if(sideDish!=null){
            System.out.println("사이드 음식 : "+sideDish);
        } else {
            System.out.println("사이드 음식 : - ");
        }

        if(drink!=null){
            System.out.println("음료 : "+drink);
        } else {
            System.out.println("음료 : - ");
        }

        if(dessert!=null){
            System.out.println("간식 : "+dessert);
        } else {
            System.out.println("간식 : - ");
        }

        if(note!=null){
            System.out.println("메모 : "+note);
        } else {
            System.out.println("메모 : - ");
        }

    }
}
