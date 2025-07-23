package org.example.advaned.kimaram.unitseven.user;

public class User {
    // 필수 및 선택 필드
    private final String name;
    private final String email;
    private final int age;
    private final String address;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Builder Class : static inner class
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
