package main.java.org.example.basic.ANheebin.uniteight;

public interface flyable {
    void fly();
}

class Airplane  implements  flyable {
    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }
}
