package lesson10_oop.interfaces;

public class Main {
    public static void main(String[] args) {
        DbDaoMock dao = new DbDaoMock();

        IAdmin daoA = new DbDaoMock();
        IGolden daoG = new DbDaoMock();
        IUser daoU = new DbDaoMock();

        System.out.println(daoA);
        System.out.println(daoG);
        System.out.println(daoU);

    }
}
