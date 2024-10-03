package trees;

import java.util.*;

public class BSTTraversal {

    public static void main(String[] args) {
        Node root = new Node(15);
        Node node1 = new Node(5);
        Node node2 = new Node(20);
        Node node3 = new Node(2);
        Node node4 = new Node(6);
        Node node5 = new Node(1);
        Node node6 = new Node(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;
        node3.right = node6;

        List<Integer> visited = inOrderTraversal(root,new ArrayList<>());

        System.out.println(visited.get(visited.size()-3));

        Set<Integer> countries = new HashSet<>();
    }

    //inorder (S,R,D): 1,2,3,5,6,15,17,20,25
    //preorder (R,S,D): 15,5,2,13,6,20,17,25
    //postorder (S,D,R): 1,3,26,5,17,25,20,15

    public static List<Integer> inOrderTraversal(Node root, List<Integer> visited){
        if (root.left!=null) {
            inOrderTraversal(root.left, visited);
        }
        visited.add(root.value);
        if (root.right!=null) {
            inOrderTraversal(root.right, visited);
        }
        return visited;
    }

    public static List<Integer> preOrderTraversal(Node root, List<Integer> visited){
        visited.add(root.value);
        if (root.left!=null) {
            inOrderTraversal(root.left, visited);
        }
        if (root.left!=null) {
            inOrderTraversal(root.right, visited);
        }
        return visited;
    }

    public static List<Integer> postOrderTraversal(Node root, List<Integer> visited){
        if (root.left!=null) {
            inOrderTraversal(root.left, visited);
        }
        if (root.left!=null) {
            inOrderTraversal(root.right, visited);
        }
        visited.add(root.value);
        return visited;
    }
}
