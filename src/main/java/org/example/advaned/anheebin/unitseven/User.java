package main.java.org.example.advaned.anheebin.unitseven;

public class User {
    private final String name;
    private final String email;
    private final int age;
    private String address;

    public User(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    public static class UserBuilder {
    private final String name;
    private final String email;
    private int age;
    private String address;

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
            return new User(name, email, age, address);
        }
    }
}
