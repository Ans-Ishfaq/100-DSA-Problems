class LL {
    private Node head;
    private Node tail;
    private int size;

    //Initializing The Constructor
    public LL() {
        this.size = size;
    }

    //Make Node Class As A BluePrint For Every Element
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //Inserting The Element In Linked List
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size++;
    }

    //Method To Display The Linked List
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> " );
            temp = temp.next;
        }
        System.out.println("End");
    }
}

public class LinkedList{

    public static void main(String[] args) {
        LL l1 = new LL();
        l1.insertFirst(5);
        l1.insertFirst(4);
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.insertFirst(1);
        l1.Display();

    }
}

