package library.classes;

public class Book {
    private final String name;
    private final String author;
    private String condition;
    private Reader reader;

    public void setReader(Reader reader) {
        if(reader !=null ){
            System.out.println("Книга '" + name + "' уже выдана");
        }
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.condition = "new";
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (this.getReader() != null){
            return "Книга{" +
                    "Название='" + name + '\'' +
                    ", Автор='" + author + '\'' +
                    ", Читатель='" + reader + '\'' +
                    '}';

        } else {
            return "Книга{" +
                    "Название='" + name + '\'' +
                    ", Автор='" + author + '\'' +
                    '}';

        }
    }
}
