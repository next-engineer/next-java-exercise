public class calulater {
    private static Object system;

    public static int add(int x, int y) { return  x + y
    }
public static  void main (string[] args) {int result = add(5, 3);
    System system;
    system.out.prntln("5 + 3 =" + result);}
}
import java.util.function.bifuction;
public class calculator { public static void main(string[] args) {
    //람다식 정의
    bifunction<integer, integer, integer> add = (x,y) -> x+y;
   //람다식 호출
    int result =add,apply(5,3);
system.out.println("5 + 3 =" + result);
}
}

(x,y) -> {
}
run.
system.out.
list.
. -> s.)
. -> system.out.);

@functionalinterface
{
    }

system.out.); //출력:7
collections. -> a.);
list.
    -> n % 2 ==0)
-> n * 2)
->system.out.

);

public class lambdaexample1{
    int sum = x+y;
    retern sum;
    runnable run = () -> system.out.println("hello lambda!")
    comparator<integer>comp = (a, b)-> a-b;
    int result = comp.compare(5,3);
    list<string> list = list.of("apple", "banana", "orange");
    //전통적 익명 클래스 방식
    comparator <string> comp = new comparator<string>(){
        public int compare (string a, string b) {
            return a.compareto(b);
        }
    };
    //lamdba로 표현
    comparator<string> comp =(a,b)-> a.compareto(b);
    int myfunction
    myfuncion add =(a, b)-> a+b;
    list<string> names = arrays.asList("Kim", "Lee", "Park");
    list<integer> list = arrays.aslist(1,2,3,4,5);
    //lambda 방식
    runable r2 =() -> system.out.println("thread 2 실행");

    lambdaexample1();

    lambdaexample1(result); //출력 :2

    lambdaexample1()

    lambdaexample1(s

    lambdaexample1("a")

    lambdaexample1(s

    lambdaexample1(s)

    lambdaexample1(add.dosomething(3,4)

    lambdaexample1(names, (a, b)

    lambdaexample1(b)

    lambdaexample1()

    lambdaexample1(n

    lambdaexample1(n

    lambdaexample1(n);

    lambdaexample1(r1)

    lambdaexample1();

    lambdaexample1(r2)

    lambdaexample1();

    public static  void main(string[]args)
        //기존방식
    runnable r1 = new  runnable();
                public void run() {
        system.out.println("thread 1 실행");
                }

    int dosomething (int x, inty);

    <n> void println(n)
};
new .
new .}
}

import java.util.*;
public class  lambdaeample2 {
    public static void main(string[] args) {
        list<string> names = arrays.aslist("Kim", "Lee", "Park", "Choi");
        //lamdba를 이용한 문자열 길이 기준 정렬
        names.sort((a, b) -> a.length() - b.length());
        names.foreach(system.out::println); //메서드 참조 방식
    }
}

import java.util.function.consumer;
import java.util.arrays;
import java.util.list;
public class lamdbaexample3 {
    public static void main(string[] args) {
        list<integer> num = arrays.aslist(10, 20, 30);
        consumer<integer>printnum = n -> system.out.println("값"+ n);
        nims.foreach(printnum);
    }
}
import java.util.function.consumer;
import java.util.arrays;
import java.util.list;
public class lambdaexample4 {
    public static void main(String[] args) {
        list<string> names = arrays.asList("apple", "banana", "avocado", "grape");

        predicate<String> startsWithA = s -> s.startsWith("a");

        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println); // 결과: apple, avocado
    }
}
import java.util.function.consumer;
import java.util.arrays;
import java.util.list;
public class lambdaexample5 {
    public static void main(string[] args) {
        list<string> list = arrays.asList("one", "two", "three");

        function<string, integer> lengthfunction = s -> s.length();

        list.stream()
                .map(lengthFunction)
                .forEach(System.out::println); // 결과: 3, 3, 5
    }
}
