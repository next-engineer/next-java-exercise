package org.example.advaned.mindongil.uniteight;

public class Computer {

    private final String cpu;
    private final String ram;
    private String storage;
    private String graphicsCard;
    boolean wifiEnabled;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiEnabled = builder.wifiEnabled;
    }

    //Getter
    public String getCpu() {return cpu;}
    public String getRam() {return ram;}
    public String getStorage() {return  storage;}
    public String getGraphicsCard() {return  graphicsCard;}
    public boolean getWifiEnabled() {return wifiEnabled;}

    public static class ComputerBuilder {

        private final String cpu;
        private final String ram;
        private String storage;
        private String graphicsCard;
        boolean wifiEnabled;

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

        public ComputerBuilder wifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
