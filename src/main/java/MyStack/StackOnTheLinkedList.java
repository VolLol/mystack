package MyStack;

import java.util.LinkedList;
import java.util.List;

public class StackOnTheLinkedList<E> implements MyStackInterface {

    private List list;

    public StackOnTheLinkedList() {
        this.list = new LinkedList();
    }


    public void push(Object item) {
        list.add(item);
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

    public List show() {
        return list;
    }


}
