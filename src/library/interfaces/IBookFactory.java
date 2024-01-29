package library.interfaces;

import library.classes.Book;

public interface IBookFactory {
    Book[] produceBooks();
    String getName();
}
