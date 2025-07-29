package org.example.advaned.mindongil.uniteight;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.println("CPU: " + comp.getCpu());
        System.out.println("RAM: " + comp.getRam());
        System.out.println("STORAGE: " + comp.getStorage());
        System.out.println("GRAPHIC CARD: " + comp.getGraphicsCard());
        System.out.println("WIFI ENABLED: " + comp.getWifiEnabled());
    }
}
