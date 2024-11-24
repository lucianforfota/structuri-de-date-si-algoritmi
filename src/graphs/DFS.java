package graphs;

import java.util.ArrayList;
import java.util.List;

public class DFS {

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
        e.children.add(a);
        b.children.add(f);
        dfs(a, new ArrayList<>());
    }

    public static void dfs(Node first, List<Node> visited){
        if (visited.contains(first)){
            //daca in visited exista nodul, ca sa nu se faca bucla infinita se iese din functia care contine nodu respectiv
            return;
        }
        System.out.println(first.value);
        visited.add(first);
        //pentru fiecare copil al lui first
            //apelez funcia recursiv pentru acel copil
        for (Node child: first.children){
            dfs(child, visited);
        }
    }

}























