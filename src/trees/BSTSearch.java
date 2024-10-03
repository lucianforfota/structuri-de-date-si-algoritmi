package trees;

import java.util.List;

public class BSTSearch {

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

        System.out.println(findElement(root,123));

    }

    public static Integer findElement (Node root, Integer x){
        //daca x mai mic decat root atunci
             //apelam recursiv functia cu root stanga lui
        //altfel daca x mai mare decat root atunci
             //apelam recursiv functi cu root dreapta lui
        //altfel
             //returnam x
        if (x<root.value && root.left!=null){
            return findElement(root.left,x);
        }
        else if (x>root.value && root.right!=null){
            return findElement(root.right,x);
        } else{
            return root.value;
        }
    }


    public static Integer findElementIterative (Node root, Integer x){
        //daca x mai mic decat root atunci
        //apelam recursiv functia cu root stanga lui
        //altfel daca x mai mare decat root atunci
        //apelam recursiv functi cu root dreapta lui
        //altfel
        //returnam x

        Node current = root;
        while (current!=null) {
            if (x < current.value && current.left != null) {
                current = current.left;
            } else if (x > current.value && current.right != null) {
                current = current.right;
            } else {
                return current.value;
            }
        }
        return null;
    }
}
