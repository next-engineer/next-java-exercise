package org.example.advaned.leejinwoo.unitone;

public class PrintReport {

    public static void main(String[] args){
        Report report = new Report("보고서", "보고서 내용");

        System.out.println("title : " + report.getTitle());
        System.out.println("content : " + report.getContent());
    }
}
