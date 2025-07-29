package org.example.advaned.kimyoungji.unitten;

public class AdapterMain {
    public static void main(String[] args) {

        // 기존 220V 기기
        Electronic220V hairDryer220v = new Electronic220V();

        // 어댑터를 통해 110V 기기로 연결
        Electronic110V device = new SocketAdapter(hairDryer220v);

        device.powerOn(); // 어댑터 통해 작동
    }
}

