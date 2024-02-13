package hw1902;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyTypeContainer {
    public static void main(String[] args) {
        DataContainer dataContainer = new DataContainer();

        dataContainer.add("q");
        dataContainer.add(1);
        dataContainer.add(Integer.valueOf(23));
        dataContainer.add("test");

        System.out.println(dataContainer.getElementByIndex(3));
        System.out.println(dataContainer.getElementByIndex(4));

        System.out.println(dataContainer);

        dataContainer.deleteElementByIndex(1);
        System.out.println(dataContainer);
    }
}

class DataContainer<E>{
    List<E> container = new ArrayList<>();
    public DataContainer(){
    }

    public void add(E element){
        this.container.add(element);
    }

    public E getElementByIndex(int index){
        return (index < container.size()) ? container.get(index) : null;
    }

    public void deleteElementByIndex(int index){
        container.remove(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(container.toArray());
    }
}
