package main.java.org.example.basic.ANheebin.unitEleven;

import java.util.*;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        System.out.println("이름 5개를 입력해줘");
        
        for(int i=0; i<5; i++){
            System.out.println("이름"+(i+1)+":");
            String name = scanner.nextLine();
            names.add(name);
        }

        for (String name : names) {
            System.out.println(name); // 리스트의 이름을 하나씩 출력
        }

        scanner.close();
    }
}
