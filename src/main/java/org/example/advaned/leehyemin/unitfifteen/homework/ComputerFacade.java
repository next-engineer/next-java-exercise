package org.example.advaned.leehyemin.unitfifteen.homework;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    private boolean isOn = false;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        if(isOn) {
            System.out.println("Computer is already on.");
            return;
        }

        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
        isOn = true;
    }

    public void stopComputer() {
        cpu.freeze();
        memory.clear();
        hardDrive.write(0, "SAVE_STATE");
        System.out.println("Computer is now off.");
        isOn = false;
    }
}
