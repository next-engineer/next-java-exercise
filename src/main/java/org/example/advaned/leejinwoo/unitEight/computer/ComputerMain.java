package org.example.advaned.leejinwoo.unitEight.computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.println("cpu : " + computer.getCpu());
        System.out.println("ram : " + computer.getRam());
        System.out.println("storage : " + computer.getStorage());
        System.out.println("graphicsCard : " + computer.getGraphicsCard());
        System.out.println("wifiEnabled : " + computer.isWifiEnabled());
    }
}
