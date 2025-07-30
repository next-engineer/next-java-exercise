package org.example.advaned.kimaram.unitten;

// Adapter 클래스 : 220V -> 110V 변환 수행
public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        System.out.println("어댑터 : 220V -> 110V로 변환 중...");
        electronic220V.connect();
        System.out.println("미국형 기기 : 110V 기기가 작동됩니다.");
    }
}
