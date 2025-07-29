package org.example.advaned.kimaram.unitnine;

// Prototype (프로토타입 패턴) : 생성 디자인 패턴 중 하나로 기존 객체를 복제하여 새로운 객체를 생성하는 방식
// 추상 클래스 : Cloneable 상속
public abstract class Shape implements Cloneable{
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    // clone() 메서드를 오버라이딩해서 복제 로직을 책임지고 있다.
    // => 하위 클래스에서는 별도의 구현 없어도 됨 단, 하위 클래스에서 참조 객체가 생기면 clone() 오버라이딩해서 사용하면 됨
    @Override
    public Shape clone() {
        try {
            // 얕은 복사(shallow copy): 최상위 객체만 복사되고 내부의 객체들은 복사되지 않고 주소(참조값)만 복사
            // 깊은 복사(deep copy)   : 객체뿐 아니라 객체가 참조하는 모든 내부 객체들도 재귀적으로 모두 새로 복사해서 완전한 독립본 생성
            // 아래 복제는 얕은 복사
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }


}
