package org.example.advaned.gojunho.unitten;

public class AdapterMain {
    public static void main(String[] args){

        Electronic220V hairDryer220v = new Electronic220V();

        Electonic110V device = new SocketAdapter(hairDryer220v);

        device.powerOn();
    }
}
