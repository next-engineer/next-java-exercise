package org.example.advaned.yunbyeongchang.unitsix;

public class Main {
    public static void main(String[] args)
    {
        NormalSingleton normalSingleton1 = NormalSingleton.getInstance();
        NormalSingleton normalSingleton2 = NormalSingleton.getInstance();

        System.out.println(normalSingleton1 == normalSingleton2);

        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton2 = SynchronizedSingleton.getInstance();

        System.out.println(synchronizedSingleton1 == synchronizedSingleton2);

        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();

        System.out.println(doubleCheckSingleton1 == doubleCheckSingleton2);

        LazyHolderSingleton lazyHolderSingleton1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton lazyHolderSingleton2 = LazyHolderSingleton.getInstance();

        System.out.println(lazyHolderSingleton1 == lazyHolderSingleton2);

    }
}
