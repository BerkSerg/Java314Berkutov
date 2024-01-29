package library.classes;

import library.interfaces.IBookFactory;

public class BookFactory implements IBookFactory {
    String name;

    public BookFactory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Book[] produceBooks() {
        Book[] books = new Book[5];
        books[0] = new Book("Мурзилка", "Народ");
        books[1] = new Book("Три мушкетера", "А.Дюма");
        books[2] = new Book("Война и мир", "Л.Толстой");
        books[3] = new Book("Евгений Онегин", "А.Пушкин");
        books[4] = new Book("Макс Фрай", "М.Фрай");
        return books;
    }

    public Book[] produceMoreBooks() {
        Book[] books = new Book[2];
        books[0] = new Book("Морозко", "Народ");
        books[1] = new Book("Алиса в стране чюдес", "Л.Каролл");
        return books;
    }
}
