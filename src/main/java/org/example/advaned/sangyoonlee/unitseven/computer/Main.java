package org.example.advaned.sangyoonlee.unitseven.computer;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.println(comp.toString());
    }
}
