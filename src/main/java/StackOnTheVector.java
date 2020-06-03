import java.util.Stack;
import java.util.Vector;

public class StackOnTheVector<E> {

    private Vector<E> list;

    public StackOnTheVector() {
        this.list = new Vector<>();
    }


    public void addElement(E o) {
        list.add(o);
    }

    public void deleteElement() {
        list.remove(list.size() - 1);
    }

    public Object readTop() {
        return list.get(list.size() - 1);
    }

    public void printAllElements() {
        System.out.println(list);
    }

}
