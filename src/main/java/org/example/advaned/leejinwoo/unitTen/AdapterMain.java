package org.example.advaned.leejinwoo.unitTen;

public class AdapterMain {
    public static void main(String[] args) {
        Electronic220V electronic220V = new Electronic220V();

        Electronic110V device = new SocketAdapter(electronic220V);

        device.powerOn();
    }
}
