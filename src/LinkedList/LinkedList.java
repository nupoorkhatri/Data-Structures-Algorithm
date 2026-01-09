package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {

        this.size = 0;
    }
    public void insertFirst(int val) {
        Node node = new Node (val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }
    public void insertLast(int val) {
        if (tail==null) {
            insertFirst(val);
            return;
        }

        Node node = new Node (val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertRec(int val , int index) {
        head =  insertInd(val, index , head);
    }

    private Node insertInd (int val , int index , Node node){
        if(index == 0 ){
            Node node1 = new Node (val , node);
            size++;
            return node1;
        }

        node.next = insertInd(val ,index-1 ,node.next);
        return node;

    }


    public void deleteDuplicates() {
        Node node = head;
        if(node.next != null && node.value == node.next.value ){
            Node temp = node.next.next;

            node.next = temp;
            size--;
        }else {
            node = node.next;
        }
        tail = node;
        tail.next = null;
    }
    public void insert (int val,int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index==size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;


        size++;
    }
//    public void find
//    public int deleteFirst() {
//        int val = head.value;
//        head = head.next;
//        if (head == null) {
//            tail = null;
//        }
//        size--;
//        return val;
//    }

    public  void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }
        public Node (int value ,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
