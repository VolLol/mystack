public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.allAboutStackOnTheLinkeList();
        main.allAboutStackOnTheArrayList();
        main.allAboutStackOnTheVector();
    }


    private void allAboutStackOnTheLinkeList() {
        StackOnTheLinkedList stackOnTheLinkedList = new StackOnTheLinkedList();

        System.out.print("Print empty my empty stack on the base of linkedList: ");
        stackOnTheLinkedList.printAllElements();

        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheLinkedList.addElement(i);
        }

        System.out.print("Print all elements ");
        stackOnTheLinkedList.printAllElements();

        System.out.println("Print last element: " + stackOnTheLinkedList.readTop());

        System.out.println("Delete last element");
        stackOnTheLinkedList.deleteElement();
        System.out.print("Show all elements without last element");
        stackOnTheLinkedList.printAllElements();

        System.out.println("Print last element: " + stackOnTheLinkedList.readTop());
        System.out.println("------------------------------------");
    }

    public void allAboutStackOnTheArrayList() {
        StackOnTheArrayList stackOnTheArrayList = new StackOnTheArrayList();

        System.out.print("Print empty my empty stack on the base of ArrayList: ");
        stackOnTheArrayList.printAllElements();

        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheArrayList.addElement(i);
        }

        System.out.print("Print all elements");
        stackOnTheArrayList.printAllElements();

        System.out.println("Print last element: " + stackOnTheArrayList.readTop());

        System.out.println("Delete last element");
        stackOnTheArrayList.deleteElement();
        System.out.print("Show all elements without last element");
        stackOnTheArrayList.printAllElements();

        System.out.println("Print last element: ");
        System.out.println("Print last element: " + stackOnTheArrayList.readTop());
        System.out.println("------------------------------------");

    }

    public void allAboutStackOnTheVector() {
        StackOnTheVector stackOnTheVector = new StackOnTheVector();
        System.out.print("Print empty my empty stack on the base of Vector: ");
        stackOnTheVector.printAllElements();

        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheVector.addElement(i);
        }

        System.out.print("Print all elements");
        stackOnTheVector.printAllElements();

        System.out.println("Print last element: " + stackOnTheVector.readTop());

        System.out.println("Delete last element");
        stackOnTheVector.deleteElement();
        System.out.print("Show all elements without last element");
        stackOnTheVector.printAllElements();

        System.out.println("Print last element: ");
        System.out.println("Print last element: " + stackOnTheVector.readTop());
        System.out.println("------------------------------------");

    }


}
