package org.example.advaned.kimyoungji.unitseven.practice.computer;

public class Computer {
    // 필수 필드
    private final String cpu;
    private final String ram;

    // 선택 필드
    private final String storage;
    private final String graphicsCard;
    private final boolean wifiEnabled;

    // private 생성자
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiEnabled = builder.wifiEnabled;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;

        private String storage = "";
        private String graphicsCard = "";
        private boolean wifiEnabled = false;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder wifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void printSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("WiFi Enabled: " + wifiEnabled);
    }
}