package org.example.basic.mindongil.unitfourteen;

public class BasicAnnotationExample {

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override
    public String toString() {
        return "BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new BasicAnnotationExample().oldMethod();
    }

}
