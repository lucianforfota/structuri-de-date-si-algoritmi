package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//parcurgere pe latime, toate pe acelasi nivel
public class BFS {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        a.children.add(b);
        a.children.add(c);
        a.children.add(d);
        b.children.add(e);
        b.children.add(f);
        System.out.println(bfs(a));

    }

    //punem pe first in coada
    //atata timp cat mai este cineva la coada

         //sterge-l pe primul din coada
         //retinem faptul ca l-am vizitat pe acest nod (il bagam intr-o lista)
         //adauga in coada toti copiii primului


    public static List<String> bfs(Node first){
        List<String> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(first);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            result.add(current.value);
            queue.addAll(current.children);
        }
        return result;
    }

}



















