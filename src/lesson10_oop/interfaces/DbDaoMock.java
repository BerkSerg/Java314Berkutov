package lesson10_oop.interfaces;

import java.util.Arrays;

public class DbDaoMock implements IUser, IGolden, IAdmin{
    User[] users;

    public DbDaoMock() {
        users = new User[6];
        users[0] = new User("User_One","admin");
        users[1] = new User("User_Two","user");
        users[2] = new User("User_Three","user");
        users[3] = new User("User_Four","user");
        users[4] = new User("User_Five","user");
        users[5] = new User("User_Six","gold");
    }

    @Override
    public String[] getAllUserNames() {
        String[] userNames = new String[users.length];
        for(int i = 0; i < users.length; i++) {
            userNames[i] = users[i].userName;
        }
        return userNames;
    }

    @Override
    public User findById(int id) {
        return users[id];
    }

    @Override
    public User findByName(String name) {
        for(int i = 0; i < users.length; i++){
            if(users[i].equals("name")){
                return users[i];
            }
        }
        return users[0];
    }

    @Override
    public void setAdmin(int id) {
        users[id].setRole("admin");
    }

    @Override
    public User[] getAllUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "DbDaoMock{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
