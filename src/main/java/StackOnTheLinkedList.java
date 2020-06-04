import java.util.LinkedList;
import java.util.List;

public class StackOnTheLinkedList<E> {

    private List list;

    public StackOnTheLinkedList() {
        this.list = new LinkedList();
    }


    public void push(Object item) {
        list.add(item);
    }

    public Object peek() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    public Object pop() {
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public List show() {
        return list;
    }


}
