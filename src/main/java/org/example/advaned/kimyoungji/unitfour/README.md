리스코프 치환 원칙(LSP): 자식 클래스는 언제나 부모 클래스의 역할을 대체할 수 있어야 한다.
  -> 부모 타입(Rectangle) 대신 자식 타입(Square)을 사용하더라도 기대한 동작이 변하면 안됨

문제점 :
Rectangle에서는 setWidth()와 setHeight()가 서로 독립적으로 동작하는 것이 정상임.
그러나 Square는 이를 상속받아 오면서 두 메서드를 강제로 동일한 값으로 설정되도록 오버라이딩함.

예: setWidth(5)를 하면 내부적으로 height도 5가 되어버림.
이로 인해 rect.setWidth(5); rect.setHeight(10);의 결과가 직사각형이 아닌 정사각형이 되어버림.
