package org.example.advaned.yunbyeongchang.unitten;

public class SocketAdapter implements Electronic110V {
    //var
    private final Electronic220V electronic220V;

    //method
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        System.out.println("어댑터가 220V를 110V로 변환하는 중...");
        electronic220V.connect();
    }

}
