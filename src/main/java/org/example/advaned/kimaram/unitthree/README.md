# 해당 인터페이스가 인터페이스 분리 원칙(ISP)을 위반하는 이유

```Java
public interface SmartDevice {
    void turnOn();
    void turnOff();
    void setTemperature(int temp);
    void setTimer(int seconds);
    void playMusic(String song);
}
```

- 서로 관련 없는 기능들을 한 인터페이스에 모두 포함하고 있기 때문
- 클래스가 사용하지 않는 메서드까지 강제로 구현해야 해서 인터페이스 분리 원칙을 위반함