하기 인터페이스가 인터페이스 분리 원칙(ISP)을 위반하는지 이유

public interface SmartDevice {
    void turnOn();
    void turnOff();
    void setTemperature(int temp);
    void setTimer(int seconds);
    void playMusic(String song);
}

ISP(인터페이스 분리 원칙): 클라이언트는 자신이 사용하지 않는 메서드에 의존하지 않아야 한다.

예:
조명(Light)은 setTemperature()나 playMusic() 기능이 필요 없음.
하지만 SmartDevice를 구현하면 불필요한 메서드까지 강제로 오버라이드해야 함.
즉, 불필요한 의존성 강제로 인해 코드가 지저분하고 유지보수 어렵다.