package org.example.advaned.kimyoungji.unitseven.practice.computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        comp.printSpecs();
    }
}
