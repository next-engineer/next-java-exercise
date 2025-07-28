package org.example.advaned.gojunho.unitten;

public class SocketAdapter implements Electonic110V{
    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V=electronic220V;
    }

    @Override
    public void powerOn() {
        System.out.println(" 어댑터가 220V → 110V로 변환 중...");
        electronic220V.connect();
    }
}
