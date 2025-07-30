package org.example.basic.leehyemin.unitfourteen;

public class BasicAnnotationExample {

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }

    @Override
    public String toString() {
        return "BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new BasicAnnotationExample().oldMethod();

        System.out.println(new BasicAnnotationExample().toString());
    }
}
