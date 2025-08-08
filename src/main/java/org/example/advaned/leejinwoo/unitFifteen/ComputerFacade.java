package org.example.advaned.leejinwoo.unitFifteen;

import org.example.basic.leejinwoo.unitTwelve.MyException;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private Power power;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive, Power power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.power = power;
    }

    public void startComputer() throws MyException {
        if("on".equalsIgnoreCase(power.state)){
            throw new MyException("전원이 이미 켜져있습니다.");
        }

        power.powerOn();
        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
        power.state = "On";
    }
    public void shutdownComputer(){
        cpu.off();
        power.powerOff();
        power.state = "Off";
    }
}
