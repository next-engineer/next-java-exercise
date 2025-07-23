package org.example.advaned.gojunho.unitseven.Computer;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;
    private final boolean wifiEnalbed;

    private Computer(Builder builder)
    {
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.graphicsCard=builder.graphicsCard;
        this.wifiEnalbed=builder.wifiEnabled;
    }

    public String getCpu(){return cpu;}
    public String getRam() {return ram;}
    public String getStorage(){return storage;}
    public String getGraphicsCard(){return graphicsCard;}
    public boolean getWifiEnabled(){return wifiEnalbed;}


    public static class Builder{
        private final String cpu;
        private final String ram;
        private String storage;
        private String graphicsCard;
        private boolean wifiEnabled;

        public Builder(String cpu,String ram){
            this.cpu=cpu;
            this.ram=ram;
        }

        public Builder storage(String storage){
            this.storage=storage;
            return this;
        }

        public Builder graphisCard(String graphicsCard){
            this.graphicsCard=graphicsCard;
            return this;
        }
        public Builder wifiEnabled(boolean wifiEnabled){
            this.wifiEnabled=wifiEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
