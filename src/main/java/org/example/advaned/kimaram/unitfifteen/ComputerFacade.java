package org.example.advaned.kimaram.unitfifteen;

// 퍼사드 클래스
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private ComputerState state;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.state = ComputerState.OFF; // 초기상태는 꺼진 상태
    }

    public void startComputer() {
        if (state == ComputerState.ON) {
            System.out.println("컴퓨터가 이미 켜져있습니다.");
            return;
        }
        cpu.freeze();
        String data = hardDrive.read(0, 1024);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
        state = ComputerState.ON;
    }

    // 컴퓨터 종료 메서드 추가
    public void shutdownComputer() {
        cpu.shutdown();
        memory.clear();
        hardDrive.spinDown();
        state = ComputerState.OFF;
    }
}
