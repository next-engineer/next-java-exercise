package org.example.basic.gojunho.unittwelve;

import java.util.Scanner;

public class convert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        try{
            Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.println("예외발생: "+e.getMessage());
        }finally {
            System.exit(0);
        }
    }
}
