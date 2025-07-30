package org.example.advaned.kimaram.unitten;

// Client 코드 : 사용자
public class AdapterMain {
    public static void main(String[] args) {

        // 기존 220V 기기
        Electronic220V hairDryer220v = new Electronic220V();

        // 어댑터를 통해 110V 기기로 연결
        Electronic110V device = new SocketAdapter(hairDryer220v);

        device.powerOn();
    }
}
