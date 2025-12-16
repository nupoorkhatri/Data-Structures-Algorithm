package LeetCode;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q83 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        System.out.println(list);

//        deleteDuplicates();
        System.out.println(list);

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode node = head;
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

}


