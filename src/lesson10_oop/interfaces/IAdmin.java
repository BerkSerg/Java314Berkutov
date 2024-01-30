package lesson10_oop.interfaces;

public interface IAdmin {
    User findById(int id);
    User findByName(String name);
    void setAdmin(int id);
    User[] getAllUsers();
}
