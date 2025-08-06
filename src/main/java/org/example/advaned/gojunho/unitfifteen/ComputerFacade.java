package org.example.advaned.gojunho.unitfifteen;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu,Memory memory,HardDrive hardDrive){
        this.cpu=cpu;
        this.memory=memory;
        this.hardDrive=hardDrive;
    }

    public void startComputer() {
        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0,data);
        cpu.jump(0);
        cpu.execute();
    }
}
