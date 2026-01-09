package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private  int size ;

    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val ){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail= head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp =  temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

    public void insertLast (int val ){
        if (tail == null) {
//            Node node = new Node(val);
//            tail = node;
//            head = tail;
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }
    public void insertIndex(int val , int index) {
        if (index == 0){
            insertFirst(val);
        }
        if (index == size){
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1 ; i < index ; i++){
            Node temp1 = temp.next;
            if(i == index-1){
                Node node = new Node(val);
                temp.next = node;
                node.next = temp1;
                break;
            }

            temp = temp1;


        }
        size++;
    }

    public int deleteFirst(){
//        if(head.next != null ){
//            head = head.next;
//        }
//        else{
//            head = null;
//            tail = null;
//        }

        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get (int index) {
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteLast() {
        if (size < 2){
            int val = deleteFirst();
            return val;
        }

        Node temp = get(size-2);
        int val = temp.next.val;
        temp.next = null;
        tail = temp ;
        return val;

    }
    public int findIndex (int val) {
        int index = 0;
        Node temp = head;
        while (temp != null){
            if (temp.val == val) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public Node find (int val){
        Node temp = head;
        while (temp != null){
            if (temp.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public Boolean findTF (int val) {
        Node temp = head;
        while (temp != null){
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteVal (int val) {
        if (findTF(val)){
            int index = findIndex(val);
            Node prev = get(index-1);
            prev.next = prev.next.next;
        }

    }

    // insert through recuresion
    public void insertRec (int val, int index) {
         head = insertRec(val, index, head);
    }
    public Node insertRec (int val , int index, Node node ){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1 , node.next);
        return node;
    }

    // remove the duplicate
    public void removeDuplicate (){
        head = duplicateFunction(head);
    }

    public Node duplicateFunction(Node head) {
        if(head == null){
            return head;
        }
        Node node = head;
        while (node != null){
            if(node.next != null && node.val == node.next.val){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }


    // print in reverse


    public class Node {
        int val ;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}
