package org.example.basic.yunbyeongchang.unitthirteen.nullpointexception;

public class NullPointExceptionDemoExample {
    //var

    //method
    public static void main(String[] args) {
        String name = null;
        //System.out.println("name's length: " + name.length());      // NullPointException

        //Safe Check
        checkString(name);

    }

    public static void checkString(String var) {
        if(var != null)
            System.out.println("String length: " + var.length());
        else
            System.out.println("Error: Current String is Null!");
    }
}
