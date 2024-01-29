package library.classes;

public class Reader {
    private final String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Читатель{" +
                "Имя='" + name + '\'' +
                '}';
    }
}
