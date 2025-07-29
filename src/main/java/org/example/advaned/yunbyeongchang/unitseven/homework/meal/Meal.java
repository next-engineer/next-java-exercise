package org.example.advaned.yunbyeongchang.unitseven.homework.meal;

public class Meal {
    //var
    private final String mainDish;
    private final int calories;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String note;

    //method
    private Meal(MealBuilder builder)
    {
        this.mainDish = builder.mainDish;
        this.calories = builder.calories;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.note = builder.note;
    }

//    public String getMainDish() { return mainDish; }
//    public int getCalories() { return calories; }
//    public String getSideDish() { return sideDish; }
//    public String getDrink() { return drink; }
//    public String getDessert() { return dessert; }
//    public String getNote() { return note; }

    public void describe()
    {
        System.out.println("---------------");
        System.out.println("메인 음식: " + mainDish);
        System.out.println("칼로리: " + calories);
        if(sideDish != null)
            System.out.println("사이드 음식: " + sideDish);
        if(drink != null)
            System.out.println("음료: " + drink);
        if(dessert != null)
            System.out.println("디저트: " + dessert);
        if(note != null)
            System.out.println("노트: " + note);    }

    //builder
    public static class MealBuilder
    {
        //var
        private final String mainDish;
        private final int calories;
        private String sideDish;
        private String drink;
        private String dessert;
        private String note;

        //method
        public MealBuilder(String mainDish, int calories)
        {
            this.mainDish = mainDish;
            this.calories = calories;
        }

        public MealBuilder sideDish(String sideDish)
        {
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder drink(String drink)
        {
            this.drink = drink;
            return this;
        }

        public MealBuilder dessert(String dessert)
        {
            this.dessert = dessert;
            return this;
        }

        public MealBuilder note(String note)
        {
            this.note = note;
            return this;
        }

        public Meal build()
        {
            return new Meal(this);
        }
    }
}
