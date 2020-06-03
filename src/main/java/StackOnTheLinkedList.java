import java.util.LinkedList;

public class StackOnTheLinkedList<E> {

    private LinkedList list;

    public StackOnTheLinkedList() {
        this.list = new LinkedList();
    }


    public void addElement(E o) {
        list.add(o);
    }

    public void printAllElements() {
        System.out.println(list);
    }

    public void deleteElement() {
        list.remove(list.size() - 1);
    }

    public Object readTop() {
        return list.get(list.size() - 1);
    }

}
