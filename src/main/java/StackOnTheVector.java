import java.util.Vector;

public class StackOnTheVector<E> {

    private Vector<Object> list;

    public StackOnTheVector() {
        this.list = new Vector<>();
    }

    public void push(Object item) {
        list.add(item);
    }

    public Object peek() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.lastElement();
        }
    }

    public Object pop() {
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

     public Vector<Object> show() {
        return list;
    }

}
