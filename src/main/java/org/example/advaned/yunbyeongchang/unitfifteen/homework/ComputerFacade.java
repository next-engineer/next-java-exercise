package org.example.advaned.yunbyeongchang.unitfifteen.homework;

public class ComputerFacade {
    //var
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private boolean isRun;

    //method
    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.isRun = false;
    }

    public void startComputer() {
        if(checkOn()) {
            return;
        }

        System.out.println("===Start Computer===");
        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
        isRun = true;
    }

    public void shutdownComputer() {
        if(checkOff()) {
            return;
        }

        System.out.println("===Shutdown Computer===");
        cpu.freeze();
        memory.unload();
        hardDrive.write(0, "SHUTDOWN");
        isRun = false;
    }

    public boolean checkOn() {
        if(isRun) {
            System.out.println("[ERROR]: Computer is already on.");
            return true;
        }

        return false;
    }

    public boolean checkOff() {
        if(!isRun) {
            System.out.println("[ERROR]: Computer is already off.");
            return true;
        }

        return false;
    }
}
