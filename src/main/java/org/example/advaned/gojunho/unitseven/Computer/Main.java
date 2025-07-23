package org.example.advaned.gojunho.unitseven.Computer;

public class Main {
    public static void main(String[] args){
        Computer comp =new Computer.Builder("Inter i7","16GB")
                .storage("1TB SSD")
                .graphisCard("NVIDIA RTX 4060")
                .wifiEnabled(true)
                .build();

        System.out.println("cpu: "+comp.getCpu());
        System.out.println("ram: "+comp.getRam());
        System.out.println("storage: "+comp.getStorage());
        System.out.println("wifi: "+comp.getWifiEnabled());
    }
}
