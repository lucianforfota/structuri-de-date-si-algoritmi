package sda1;

public class Ex4 {
    //### 4. Verifica daca un String este o rotatie a altui String.
    //
    //De exemplu, String-ul "cab" este rotatie a string-ului "abc", dar string-ul "acb" nu este rotatie a string-ului "abc".

    public static void main(String[] args) {
        String s1 = "cab";
        String s2 = "abc";

        //daca lungimile diferite, atunci clar nu sunt rotatie

        //parcurg de la 0 la lungimea lui s1
        //rotesc
        //verifi daca rotirea este egala cu s2
        //ma opresc


        String concat = s2+s2;
        if (concat.contains(s1)){
            System.out.println("rotatie");
        }else{
            System.out.println("nu este rotatie");
        }

    }
}
