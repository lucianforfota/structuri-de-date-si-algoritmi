package sda1;

public class Ex6 {
    public static void main(String[] args) {
        //### 6. Scrie un program care sa codifice un String dupa metoda "Run Length Encoding".
        //
        //Aceasta metoda detecteaza secventele de litere identice dintr-un String si le transforma intr-o cifra,
        // care reprezinta de cate ori apare acea litera in acea secventa.
        //De exemplu, String-ul "AAAAAAAAAAAAABBCCCCDD" va fi convertit in "9A4A2B4C2D". Observa ca nu se foloseste 13A, secventele maxime fiind de 9 litere.

        //initial count este 1
        //parucurg string-ul de la pozitia 1
        //daca caracterul curent este egal cu caracterul anterior SI count mai mic ca 9
        //incrementez count
        //altfel
        //adaug la result count si litera anterioara
        //count devine 1


        String s = "BBCCCCDD";
        String result = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1) && count<9){
                count++;
            } else{
                result += Integer.toString(count) + s.charAt(i-1);
                count = 1;
            }
        }

        result += Integer.toString(count) + s.charAt(s.length()-1);
        System.out.println(result);


    }
}