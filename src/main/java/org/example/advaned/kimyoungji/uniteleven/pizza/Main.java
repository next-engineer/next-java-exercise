package org.example.advaned.kimyoungji.uniteleven.pizza;

public class Main {
    public static void main(String[] args) {
        // 1) 플레인
        Pizza p1 = new PlainPizza();
        print(p1);

        // 2) 치즈만
        Pizza p2 = new Cheese(new PlainPizza());
        print(p2);

        // 3) 치즈 + 페퍼로니
        Pizza p3 = new Pepperoni(new Cheese(new PlainPizza()));
        print(p3);

        // 4) 치즈 + 올리브 + 페퍼로니 (순서 바꿔도 동작 동일)
        Pizza p4 = new Pepperoni(new Olives(new Cheese(new PlainPizza())));
        print(p4);
    }

    private static void print(Pizza pizza) {
        System.out.printf("%s => $%.2f%n", pizza.getDescription(), pizza.getCost());
    }
}