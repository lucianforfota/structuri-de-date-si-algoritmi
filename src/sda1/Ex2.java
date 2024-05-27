package sda1;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    //### 2. Implementeaza jocul "piatra-foarfece-hartie".
    //
    //Utilizatorul are la dispozitie alegerile "piatra", "foarfece", sau "hartie".
    //
    //Alegerea utilizatorului va fi citita de la tastatura.
    //Alegerea calculatorului va fi generata random.
    //
    //- Daca alegerile sunt egale, atunci se va afisa "remiza".
    //- Daca utilizatorul alege piatra si calculatorul foarfeca, sau utilizatorul foarfeca si calculatorul hartie,
    // sau utilizatorul hartie si calculatorul piatra, atunci utilizatorul castiga.
    //- Daca este fix invers, atunci calculatorul castiga.
    //
    //Implementeaza apoi versiunea jocului in care se alege cel mai bun jucator din 3 runde de joc.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        String[] choices = {"piatra", "foarfeca","hartie"};
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        String computerChoice = choices[randomIndex];
        System.out.println("computer choice is "+ computerChoice);

        String winner = getWinner(userChoice, computerChoice);

    }

    private static String getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)){
            return "remiza";
        }else if (userWins(userChoice, computerChoice)){
            return "Ã¼ser";
        } else{
            return "computer";
        }
    }

    private static boolean userWins(String userChoice, String computerChoice) {
        return (userChoice.equals("piatra") && computerChoice.equals("foarfeca")) || (userChoice.equals("foarfeca") && computerChoice.equals("hartie")) || (userChoice.equals("hartie") && computerChoice.equals("piatra"));
    }
}
