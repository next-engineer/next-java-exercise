package org.example.advaned.kimaram.unitfifteen;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);
        computerFacade.startComputer(); // 컴퓨터 켜짐
        computerFacade.startComputer(); // 컴퓨터가 이미 켜져있습니다.
        computerFacade.shutdownComputer(); // 컴퓨터 꺼짐
    }
}
