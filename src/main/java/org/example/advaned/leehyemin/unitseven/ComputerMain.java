package org.example.advaned.leehyemin.unitseven;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1=new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .build();

        System.out.println("CPU : "+computer1.getCpu());
        System.out.println("RAM : "+computer1.getRam());
        System.out.println("STORAGE : "+computer1.getStorage());
        System.out.println("GRAPHICSCARD : "+computer1.getStorage());

    }
}
