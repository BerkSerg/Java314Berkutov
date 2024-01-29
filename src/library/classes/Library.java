package library.classes;

import library.interfaces.ILibrarian;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    ILibrarian librarian;

    public Library(String name) {
        this.name = name;
    }

    public ILibrarian getLibrarian() {
        return librarian;
    }

    public void orderBook(BookFactory factory) {
        Book[] newBooks = factory.produceBooks();
        this.addBooksToLibrary(newBooks);
        System.out.printf("\n%s получила книги с '%s'\n", librarian.getName(), factory.name);
        printListOfBooks();
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
        System.out.printf("\n%s теперь работает в '%s'", librarian.getName(), this.name);
    }

    public void addBooksToLibrary(Book[] newBooks) {
        books.addAll(Arrays.asList(newBooks));
    }

    public Book findBookByName(String name) {
        for (Book book : this.books) {
            if (book != null && book.getName().equals(name)) {
                return book;
            }
        }
        System.out.println("Такой книги нет в библиотеке: " + name);
        return null;
    }

    public void getBookToReader(String bookName, Reader reader) {
        Book book = findBookByName(bookName);
        if (book != null){
            this.librarian.getBookToReader(book, reader);
        }
    }

    public void getBookToReader(Book book, Reader reader) {
        book.setReader(reader);
    }

    public void returnBook(Book book){
        librarian.takeBookFromReader(book);
    }

    public void returnBook(String bookName){
        Book book = findBookByName(bookName);
        if (book != null){
            librarian.takeBookFromReader(book);
        }
    }

    public void destroyBook(Book book){
        librarian.setCondition(book, "burned");
        books.remove(book);
    }

    public void printListOfBooks(){
        System.out.println("\nСписок книг");
        for (Book book : books){
            System.out.println(book);
        }
    }
}
