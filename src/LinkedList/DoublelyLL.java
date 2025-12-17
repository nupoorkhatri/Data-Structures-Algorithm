package Tutorial.LinkedList;

public class DoublelyLL {

    private Node head;
    private int size;
    public DoublelyLL(){
        this.size = 0;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;

    }
    public Node get (int index ){
        if (index < size) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        else {
            return null;
        }
    }
    public void insertIndex(int val , int index){
        Node temp = get(index);
        Node node = new Node(val);

        if (index == size ){
            insertLast(val);
        }
        if (index == 0) {
            insertFirst(val);
        }
        if (index > 0 && index < size){
            node.next = temp;
            node.prev = temp.prev;
            temp.prev.next = node;
            temp.prev = node;
        }
        size++;
    }

    public void insertLast (int val ) {
        Node node = new Node(val);
        Node temp = last();
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }


    public void display() {
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void displayRev() {
        Node temp = last();

        while (temp != null){
            System.out.print(temp.val +" -> ");
            temp = temp.prev;
        }
        System.out.println("start");
    }
 // if Tail is not given
    public Node last(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
