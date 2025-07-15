package org.example.advaned.leehyemin.unitone;

//Report 신규 등록
public class ReportApp {
    public static void main(String[] args) {

        ReportStorage reportStorage=new ReportStorage("title", "contents");
        Report report = new Report("title", "contents");
        reportStorage.addReport(report);

        reportStorage.selectAllReports();
        reportStorage.selectReportByTitle(report.getTitle());
    }
}

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("제목 : ");
//        int a=sc.nextInt();
//        String title=String.valueOf(a);
//
//        System.out.println();
//
//        System.out.print("내용 : ");
//        int b =sc.nextInt();
//        String contents=String.valueOf(b);
