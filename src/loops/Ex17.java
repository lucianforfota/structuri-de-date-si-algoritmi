package loops;

import java.util.Random;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        //17. Creeaza un guessing game.
        //Programul tau trebuie sa genereze un numar random (intre 1 si 100),
        // iar apoi sa ii ceara utilizatorului sa il ghiceasca.
        //
        //Daca numarul dat de utilizator este mai mic decat numarul generat,
        // atunci afiseaza mesajul "Prea mic, mai incearca" si da-i posibilitatea utilizatorului sa introduca un nou numar.

        //Daca numarul dat de utilizator este mai mare decat numarul generat,
        // atunci afiseaza mesajul "Prea mare, mai incearca" si da-i posibilitatea utilizatorului sa introduca un nou numar.

        //Daca numarul dat de utilizator este egal cu numarul generat, atunci afiseaza mesajul "Ai ghicit".\

        //Pentru a genera un numar random intre 1 si 100, si a-l introduce intr-o variabila, foloseste:
        //
        //Random random = new Random();
        //int numberToGuess = random.nextInt(100) + 1;

        //HINT: s-ar putea ca "do while" sa se potriveasca mai bine aici.
        //
        //Imbunatateste apoi programul dandu-i posibilitatea utilizatorului sa faca maxim 5 incercari.
        //Daca ghiceste numarul din maxim 5 incercari, afiseaza in consola si din cate incercari a reusit.
        //Altfel, afiseaza in consola faptul ca nu a reusit sa ghiceasca si ca jocul s-a terminat.\

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;


        //citim de la tastatura guess
        //atat timp cat guess diferit de numberToGuess
        //daca guess mai mic decat number to guess
        //afiseaza prea mic, mai incearca
        //atlfel daca guess mai mare decat number to guess
        //afiseaza prea mare, mai incearca
        //citim de la tastatura un numar si il bagam in guess
        //afisez sunt egale, ai ghicit

        int guess = scanner.nextInt();
        while (guess != numberToGuess){
            if (guess<numberToGuess){
                System.out.println("prea mic, ma incearca");
            } else if (guess > numberToGuess){
                System.out.println("prea mare, mai incearca");
            }
            guess = scanner.nextInt();
        }
        System.out.println("ai ghicit");

    }
}
