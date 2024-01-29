package library.interfaces;

import library.classes.Book;
import library.classes.Reader;

public interface ILibrarian {
    void setCondition(Book book, String condition);
    void getBookToReader(Book book, Reader reader);
    void takeBookFromReader(Book book);
    String getName();
}
