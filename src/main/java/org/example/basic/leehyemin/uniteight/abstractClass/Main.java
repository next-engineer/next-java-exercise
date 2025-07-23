package org.example.basic.leehyemin.uniteight.abstractClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가로의 길이를 입력하시오.");
        int width = sc.nextInt();

        System.out.println("세로의 길이를 입력하시오.");
        int height = sc.nextInt();
        Shape rec=new Rectangle(width,height);

        System.out.println("사각형의 면적 : "+rec.area());

        System.out.println("반지름의 길이를 입력하시오.");
        int radius = sc.nextInt();
        Shape cir=new Circle(radius);

        System.out.println("원의 면적 : "+cir.area());
    }
}
