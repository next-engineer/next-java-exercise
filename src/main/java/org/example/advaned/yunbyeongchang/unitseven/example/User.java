package org.example.advaned.yunbyeongchang.unitseven.example;

public class User {
    //var
    private final String name;
    private final String email;
    private final int age;
    private final String address;

    //method
    private User(UserBuilder builder)       // "private" 생성자
    {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getAddress() { return address; }


    // Builder Class
    public static class UserBuilder {   // User 클래스와 별개, 독립적으로 생성할 수 있는 구조를 위해 static 사용
        //var
        private final String name;      // 필수
        private final String email;     // 필수
        private int age;                // 선택
        private String address;         // 선택

        //method
        public UserBuilder(String name, String email)
        {
            this.name = name;
            this.email = email;
        }

        public UserBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address)
        {
            this.address = address;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }

}
