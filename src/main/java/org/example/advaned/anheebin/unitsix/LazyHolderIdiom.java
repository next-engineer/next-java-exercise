package main.java.org.example.advaned.anheebin.unitsix;

public class LazyHolderIdiom {
    private LazyHolderIdiom() {}

    // 내부 클래스가 실제 싱글톤 인스턴스를 생성
    private static class Holder {
        private static final LazyHolderIdiom INSTANCE = new LazyHolderIdiom();
    }

        public static LazyHolderIdiom getInstance() {
        return Holder.INSTANCE;
    }

    public class Main {
        public static void main(String[] args) {
            LazyHolderIdiom instance = LazyHolderIdiom.getInstance();
            System.out.println(instance);
        }
    }
}
