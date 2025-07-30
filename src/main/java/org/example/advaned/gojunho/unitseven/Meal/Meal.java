package org.example.advaned.gojunho.unitseven.Meal;

public class Meal {
    private final String mainDish;
    private final int calories;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String note;

    private Meal(Builder builder){
        this.mainDish=builder.mainDish;
        this.calories=builder.calories;
        this.sideDish=builder.sideDish;
        this.drink=builder.drink;
        this.dessert=builder.dessert;
        this.note=builder.note;
    }
    public void describe(){
        System.out.println("메인음식은 "+mainDish+" 칼로리는"+calories);

        if(sideDish!=null){
            System.out.println("부식: "+sideDish);
        }
        if(drink!=null){
            System.out.println("음료: "+drink);
        }
        if(dessert!=null){
            System.out.println("간식: "+dessert);
        }
        if(note!=null){
            System.out.println("메모: "+note);
        }

    }
    public static class Builder{
        private final String mainDish;
        private final int calories;
        private String sideDish;
        private String drink;
        private String dessert;
        private String note;

        public Builder(String mainDish,int calories){
            this.mainDish=mainDish;
            this.calories=calories;
        }

        public Builder sideDish(String sideDish){
            this.sideDish=sideDish;
            return this;
        }

        public Builder drink(String drink){
            this.drink=drink;
            return this;
        }

        public Builder dessert(String dessert){
            this.dessert=dessert;
            return this;
        }

        public Builder note(String note){
            this.note=note;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }
    }
}
