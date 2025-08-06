package org.example.advaned.yunbyeongchang.unitfifteen.homework;

public class ComputerFacade {
    //var
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    //method
    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        System.out.println("===Start Computer===");
        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
    }

    public void shutdownComputer() {
        System.out.println("===Shutdown Computer===");
        cpu.freeze();
        memory.unload();
        hardDrive.write(0, "SHUTDOWN");
    }
}
