package sda1;

public class Ex5 {
    public static void main(String[] args) {
        //### 5. Scrie un program care sa inverseze cuvintele dintr-un String.
        //
        //De exemplu, pentru "programarea este usoara", se va afisa "usoara este programarea".


        //input
        String sentence = "Ana are mere";

        //cuvintele din string le bag intr-un array
        String[] words = sentence.split(" ");

        //output
        String reversed = "";
        for (int i = words.length - 1; i >=0 ; i--) {
            reversed += words[i]+" ";
        }

        System.out.println(reversed);


    }
}
