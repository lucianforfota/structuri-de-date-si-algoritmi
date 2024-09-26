package linkedlists;

import java.util.LinkedList;

public class RemoveKthNodeFromEnd {


    public static void main(String[] args) {
        //1->2->3->4->5->6
        //k = 3

        Node node3 = new Node (3, new Node(4, null));
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);
        removeKthNodeFromEnd(head,2);
        printLinkedList(head);

    }

    public static void printLinkedList(Node head){
        Node current = head;
        while (current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void removeKthNodeFromEnd(Node head, int k ){
        Node first = head;
        Node second = head;
        //decalam second cu k pozitii spre dreapta
        for (int i = 1; i <= k ; i++) {
            second = second.next;
        }
        //atata timp cat second.next diferit de null
           //mut second la urmatorul
           //mut first la urmatorul
        while (second.next!=null){
            second = second.next;
            first = first.next;
        }
        //first.next devine first.next.next
        first.next = first.next.next;
    }
}
