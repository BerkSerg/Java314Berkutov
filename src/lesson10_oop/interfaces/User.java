package lesson10_oop.interfaces;

public class User {
    String userName;
    String password;
    String role;

    public User(String userName, String role) {
        this.userName = userName;
        this.password = "qwe";
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
