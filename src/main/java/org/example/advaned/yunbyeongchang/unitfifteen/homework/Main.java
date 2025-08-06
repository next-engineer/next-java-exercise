package org.example.advaned.yunbyeongchang.unitfifteen.homework;

public class Main {
    //var

    //method
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();

        ComputerFacade computer = new ComputerFacade(cpu, memory, hd);
        computer.startComputer();

        computer.shutdownComputer();
    }

}
