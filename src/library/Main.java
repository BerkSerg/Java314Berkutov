package library;

import library.classes.*;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        final Library library = new Library("Библиотека им. Джавы Изучаева");
        final BookFactory mainFacrory = new BookFactory("Фабрика <<Синий станок>>");
        final BookFactory smallFacrory = new BookFactory("Фабрика <<Дядя Федор>>");

        library.setLibrarian(new Librarian("Виолетта Карловна"));

        library.orderBook(mainFacrory);

        Reader reader1 = new Reader("Андрей Петрович");
        Reader reader2 = new Reader("Даша Донцова");

        library.getBookToReader("Три мушкетера", reader1);
        Book murzilka = library.findBookByName("Мурзилка");
        library.getBookToReader(murzilka, reader1);
        System.out.println(murzilka);

        library.getBookToReader(murzilka, reader2);
        library.getBookToReader("Война и мир", reader2);

        library.returnBook(murzilka);
        library.returnBook("Война и мир");
        System.out.println(murzilka.getCondition());
        library.getLibrarian().setCondition(murzilka, "bad");

        library.destroyBook(murzilka);

        library.orderBook(mainFacrory);


        library.printListOfBooks();

    }
}
