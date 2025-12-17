package Tutorial.LinkedList;

public class DLL {

    Node head ;
    Node tail;

    public void insertFirst (int val) {
        Node node = new Node (val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node node1 = head;

        while (node1.next != null){
            node1 = node1.next;
        }

        node1.next = node;
        node.next = null;
        node.prev = node1;

    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + " -- ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while (last != null){
            System.out.print(last.val + " - ");
            last = last.prev;
        }
    }

    public void displayRev() {
        Node node = tail;
        while (node != null){
            System.out.print(node.val + " -- ");
            node = node.prev;
        }
        System.out.println("END");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
