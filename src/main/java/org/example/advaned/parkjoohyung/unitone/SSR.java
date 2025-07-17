package org.example.advaned.parkjoohyung.unitone;

import java.io.FileWriter;


public class SSR {
    private String title;
    private String content;

    public SSR(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }


    

    // 출력 담당 클래스
    class ReportPrinter {
        public void printReport(SSR report){
            System.out.println("Title: " + report.getTitle());
            System.out.println("Content: " + report.getContent());
        }
    }

    // 파일 저장 담당 클래스
    class ReportSaver {
        public void saveToFile(SSR report, String fileName){
            try{
                FileWriter writer = new FileWriter(fileName);
                writer.write("Title: " + report.getTitle() + "\n");
                writer.write("Content: " + report.getContent() + "\n");
                writer.close();
            }catch(Exception e){
                System.out.println("파일 저장 실패: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        SSR report = new SSR("제목", "내용");
        ReportPrinter printer = report.new ReportPrinter();  
        ReportSaver saver = report.new ReportSaver();

        printer.printReport(report);
        saver.saveToFile(report, "report.txt");
    }
}
