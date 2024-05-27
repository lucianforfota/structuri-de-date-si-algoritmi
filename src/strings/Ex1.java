package strings;

public class Ex1 {
    public static void main(String[] args) {
        //1. Scrie un program care sa extraga prima jumatate a unui String de lungime para
        //De exemplu, pentru "programmer", se va afisa in consola "progr".


        String s = "programmer";
        s = s.substring(0, s.length()/2);
        System.out.println(s);

    }
}
