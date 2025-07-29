package org.example.advaned.yunbyeongchang.unitseven.homework.computer;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Computer computer1 = new Computer.ComputerBuilder("Intel I7", "16GB")
                .build();
        Computer computer2 = new Computer.ComputerBuilder("Ryzen 7800X3D", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.println("cpu: " + computer1.getCpu() + ", ram: " + computer1.getRam());
        System.out.println("cpu: " + computer2.getCpu() +
                ", ram: " + computer2.getRam() +
                ", storage: " + computer2.getStorage() +
                ", graphicsCard: " + computer2.getGraphicsCard() +
                ", wifiEnabled: " + computer2.getWifiEnabled());



    }

}
