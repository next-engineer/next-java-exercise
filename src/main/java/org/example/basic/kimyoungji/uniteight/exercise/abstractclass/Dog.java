package org.example.basic.kimyoungji.uniteight.exercise.abstractclass;

// Animal 클래스를 상속하는 Dog 클래스
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
