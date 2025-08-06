package org.example.advaned.leehyemin.unitfifteen.homework;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();

        ComputerFacade computer = new ComputerFacade(cpu, memory, hd);
        computer.startComputer();
        System.out.println("-----------------------------------------------");
        computer.stopComputer();
        System.out.println("-----------------------------------------------");
        computer.startComputer();
    }
}
