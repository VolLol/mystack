public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.allAboutStackOnTheLinkedList();
        main.allAboutStackOnTheArrayList();
        main.allAboutStackOnTheVector();
    }


    private void allAboutStackOnTheLinkedList() {
        MyStackInterface stackOnTheLinkedList = new StackOnTheLinkedList();

        System.out.println("Print empty my empty stack on the base of linkedList: " + stackOnTheLinkedList.show());
        System.out.println("Print empty last element: " + stackOnTheLinkedList.peek());


        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheLinkedList.push(i);
        }

        System.out.println("Print all elements " + stackOnTheLinkedList.show());

        System.out.println("Print last element: " + stackOnTheLinkedList.peek());

        System.out.println("Delete last element");
        stackOnTheLinkedList.pop();
        System.out.println("Show all elements without last element" + stackOnTheLinkedList.show());

        System.out.println("Print last element: " + stackOnTheLinkedList.peek());
        System.out.println("------------------------------------");
    }

    private void allAboutStackOnTheArrayList() {
        MyStackInterface stackOnTheArrayList = new StackOnTheArrayList();

        System.out.println("Print empty my empty stack on the base of ArrayList: " + stackOnTheArrayList.show());
        System.out.println("Print empty last element: " + stackOnTheArrayList.peek());

        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheArrayList.push(i);
        }

        System.out.println("Print all elements " + stackOnTheArrayList.show());
        System.out.println("Print last element: " + stackOnTheArrayList.peek());

        System.out.println("Delete last element");
        stackOnTheArrayList.pop();
        System.out.println("Show all elements without last element" + stackOnTheArrayList.show());

        System.out.println("Print last element: " + stackOnTheArrayList.peek());
        System.out.println("Print all elements: " + stackOnTheArrayList.show());
        System.out.println("------------------------------------");

    }

    private void allAboutStackOnTheVector() {
        MyStackInterface stackOnTheVector = new StackOnTheVector();
        System.out.println("Print empty my empty stack on the base of Vector: " + stackOnTheVector.show());
        System.out.println("Print empty last element: " + stackOnTheVector.peek());

        for (int i = 0; i < 4; i++) {
            System.out.println("Add element " + i);
            stackOnTheVector.push(i);
        }

        System.out.println("Print all elements: " + stackOnTheVector.show());
        System.out.println("Print last element: " + stackOnTheVector.peek());

        System.out.println("Delete last element. ");
        stackOnTheVector.pop();

        System.out.println("Show all elements without last element" + stackOnTheVector.show());
        System.out.println("Print last element: " + stackOnTheVector.peek());
        System.out.println("------------------------------------");

    }


}
