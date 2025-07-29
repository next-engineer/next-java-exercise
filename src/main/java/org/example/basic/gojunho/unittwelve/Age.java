package org.example.basic.gojunho.unittwelve;

public class Age {
    public static void main(String[] args)
    {
        try {
            CheckAge(16);
        } catch (AgeException e){
            System.out.println("사용자 정의 예외: "+e.getMessage());
        } finally {
            System.exit(0);
        }
    }
    
    public static void CheckAge(int age) throws AgeException{
        if(age<19){
            throw new AgeException("미성년자에요");
        }
    }
}
