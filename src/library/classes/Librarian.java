package library.classes;

import library.interfaces.ILibrarian;

public class Librarian implements ILibrarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setCondition(Book book, String condition) {
        book.setCondition(condition);
        if(condition.equals("bad")){
            System.out.println(name + " в шоке, книга " + book.getName() + " безнадежно испорчена");
        }
        if(condition.equals("burned")){
            System.out.println(name + " сожгла гнигу '" + book.getName() + "'");
        }
    }

    @Override
    public void getBookToReader(Book book, Reader reader) {
        book.setReader(reader);
        book.setCondition("used");
        System.out.printf("\nКнигу '%s' выдали читателю %s\n", book.getName(), reader);
    }

    @Override
    public void takeBookFromReader(Book book) {
        book.setReader(null);
        book.setCondition("used");
        System.out.printf("\nКнига '%s' вернулась в библиотеку\n", book.getName());
    }
}
