package org.example.advaned.kimyoungji.unitseven.exercise;

public class User {
    // 필수 및 선택 필드
    private final String name;
    private final String email;
    private final int age;
    private final String address;

    // private 생성자 (Builder를 통해서만 생성)
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Getter
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    // Builder 클래스 (static inner class)
    public static class UserBuilder {
        private final String name;     // 필수
        private final String email;    // 필수
        private int age;               // 선택
        private String address;        // 선택

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
