package MyStack;

import java.util.ArrayList;
import java.util.List;

public class StackOnTheArrayList<E> implements MyStackInterface {

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
        Object o = null;
        try {
            o = list.get(list.size() - 1);
        } catch (IndexOutOfBoundsException e) {
        }
        return o;
    }


    public Object pop() {
        Object o = null;
        if (list.size() > 0) {
            o = list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        return o;
    }
}
