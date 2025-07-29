package org.example.advaned.kimyoungji.unitone;

public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // getter만 제공 (SRP 유지)
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
