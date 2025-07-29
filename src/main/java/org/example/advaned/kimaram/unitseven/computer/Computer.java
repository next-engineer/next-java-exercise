package org.example.advaned.kimaram.unitseven.computer;

public class Computer {
    private final String cpu;       // 필수
    private final String ram;       // 필수
    private final String storage;         // 선택
    private final String graphicsCard;    // 선택
    private final boolean wifiEnabled;    // 선택

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiEnabled = builder.wifiEnabled;
    }

    // Getter
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    // Builder Class : static inner class
    public static class ComputerBuilder {
        private final String cpu;       // 필수
        private final String ram;       // 필수
        private String storage;         // 선택
        private String graphicsCard;    // 선택
        private boolean wifiEnabled;    // 선택

        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder wifiEnabled(Boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
