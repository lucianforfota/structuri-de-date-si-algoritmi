package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class MergeNodeOfLinkedLists {

//test
    public static void main(String[] args) {
        //2,3,8,4
        //6,8,4

        Node head1 = new Node(2,new Node (3, new Node(8, new Node(4,null))));
        Node head2 = new Node(6, new Node(8, new Node(4, null)));
        System.out.println(findMergeNode(head1,head2).value);
    }

    public static Node findMergeNode(Node head1, Node head2){
        //parcurg prima lista inlanuita si adaug in set toate valorile din prima lista inlatuita
        //parcrug a doua lista
            //daca elementul curent este deja in set
                 //returnez elementul curent
            //adaug in set elemetul curent
        Set<Integer> nodesSet = new HashSet<>();
        Node currentNode = head1;
        while (currentNode != null){
            nodesSet.add(currentNode.value);
            currentNode = currentNode.next;
        }
        currentNode = head2;
        while (currentNode != null){
            if (nodesSet.contains(currentNode.value)){
                return currentNode;
            }
            nodesSet.add(currentNode.value);
            currentNode = currentNode.next;
        }
        return null;
    }


    



















}
