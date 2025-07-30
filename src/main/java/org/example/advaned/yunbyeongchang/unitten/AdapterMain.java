package org.example.advaned.yunbyeongchang.unitten;

public class AdapterMain {
    //var

    //method
    public static void main(String[] args) {

        //기존 220V
        Electronic220V hairDryer220v = new Electronic220V();

        //어댑터를 통해 110V로 연결
        Electronic110V device = new SocketAdapter(hairDryer220v);

        device.powerOn(); //어댑터 통해 작동

    }

}

//