import java.util.ArrayList;
import java.util.List;

public class StackOnTheArrayList<E> {

    private List list;

    public StackOnTheArrayList() {
        this.list = new ArrayList();
    }


    public void push(Object item) {
        list.add(item);
    }

    public List show() {
        return list;
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
}
