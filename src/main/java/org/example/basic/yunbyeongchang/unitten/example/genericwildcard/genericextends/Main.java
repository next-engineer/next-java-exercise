package org.example.basic.yunbyeongchang.unitten.example.genericwildcard.genericextends;

import java.util.*;

public class Main {
    List<Dog> dogList = new ArrayList<>();
    //List<Animal> animalList = dogList;            //호환되지 않는 타입
    List<? extends Animal> animalList = dogList;    // Animal을 상속하는 자식 클래스
}
