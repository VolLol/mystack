import java.util.ArrayList;
import java.util.List;

public class StackOnTheArrayList<E> {

    private List list;

    public StackOnTheArrayList() {
        this.list = new ArrayList();
    }


    public void printAllElements() {
        System.out.println(list);
    }

    public void addElement(E e) {
        list.add(e);
    }


    public void deleteElement() {
        list = list.subList(0, list.size() - 1);
    }

    public Object readTop() {
        Object element = list.get(list.size() - 1);
        return element;
    }
}
