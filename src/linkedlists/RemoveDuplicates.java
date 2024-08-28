package linkedlists;

public class RemoveDuplicates {

    //1->1->3->4->4->4->5->6->6

    //1->3->4->5->6

    public static void main(String[] args) {
        Node node4 = new Node(4,null);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(1,node3);
        Node node1 = new Node(1,node2);

        removeDuplicates(node1);
    }

    public static Node removeDuplicates (Node head){
        Node currentNode = head;
        while (currentNode != null){
            Node nextNode = currentNode.next;
            while (nextNode != null && nextNode.value == currentNode.value){
                nextNode = nextNode.next;
            }
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        return null;
    }
}
