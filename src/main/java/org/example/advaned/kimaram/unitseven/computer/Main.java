package org.example.advaned.kimaram.unitseven.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.printf("CPU: %s, RAM: %s, Storage: %s, GraphicsCard: %s, WifiEnabled: %s%n",
                computer1.getCpu(), computer1.getRam(), computer1.getStorage(), computer1.getGraphicsCard(),
                computer1.isWifiEnabled());

    }
}
