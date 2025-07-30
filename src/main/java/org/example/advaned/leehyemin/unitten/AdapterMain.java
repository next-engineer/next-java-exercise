package org.example.advaned.leehyemin.unitten;

public class AdapterMain {
    public static void main(String[] args) {
        Electronic220V hairDryer220v = new Electronic220V();

        Electronic110V device = new SocketAdapter(hairDryer220v);

        device.powerOn();
    }
}
