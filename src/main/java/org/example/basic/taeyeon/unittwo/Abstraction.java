package org.example.basic.taeyeon.unittwo;

public class Abstraction {
}
abstract class Animal {
    // 추상 메서드 (구현 없음)
    abstract void makeSound();

    // 일반 메서드 (구현 있음)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
interface Flyable {
    void fly();
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying!");
    }
}
abstract class Shape {
    abstract double area();
}

abstract class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int i, int i1) {

    }

    // 생성자 및 area() 구현
}

abstract class Circle extends Shape {
    private double radius;

    public Circle(int i) {

    }

    // 생성자 및 area() 구현
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5) {
            @Override
            double area() {
                return 0;
            }
        };  // 면적: 20
        Shape s2 = new Circle(3) {
            @Override
            double area() {
                return 0;
            }
        };       // 면적: 28.27...

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}

class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}

