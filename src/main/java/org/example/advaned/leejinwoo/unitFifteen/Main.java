package org.example.advaned.leejinwoo.unitFifteen;

import org.example.basic.leejinwoo.unitTwelve.MyException;

public class Main {
    public static void main(String[] args) throws MyException {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();
        Power power = new Power();

        ComputerFacade computer = new ComputerFacade(cpu, memory, hd, power);
        computer.startComputer();
//        computer.startComputer();
        computer.shutdownComputer();

    }
}
