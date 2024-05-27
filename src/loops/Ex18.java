package loops;

import java.util.Scanner;

public class Ex18 {
    //18. Creeaza un sistem de verificare a PIN-ului.
    //Defineste in cadrul programului o variabila care sa contina un PIN, format din 4 cifre,
    // care va reprezenta PIN-ul corect.
    //Un utilizator are maxim 3 incercari sa introduca de la tastatura PIN-ul corect.
    //Daca reuseste sa faca asta, se va afisa in consola "PIN corect" si programul se va opri.
    //Daca nu reuseste sa faca asta, se va afisa in consola "PIN incorect" si programul se va opri.\

    public static void main(String[] args) {
        int correctPin = 1234;
        int userPin;

        //initializez i cu 0;
        //citesc de la tast userPin
        //atat timp cat userPin diferit de correctPin SI numarul de incercari mai mic decat 3
        //afisez "pin gresit, reintrodu pinul"
        //citesc de la tastatura userPin
        //i++
        //afisez pin corect

//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        userPin = scanner.nextInt();
//        while (i<3 && userPin != correctPin){
//            System.out.println("Pin greist, reintrodu");
//            userPin = scanner.nextInt();
//            i++;
//        }
//        if (i<3) {
//            System.out.println("pin corect");
//        }

//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        do {
//            System.out.println("Introdu pinul");
//            userPin = scanner.nextInt();
//            i++;
//        } while (i<3 && userPin != correctPin);
//
//        if (i<3) {
//            System.out.println("pin corect");
//        }

//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        while (i < 3) {
//            userPin = scanner.nextInt();
//            if (userPin == correctPin) {
//                System.out.println("pin corect");
//                break;
//            } else {
//                System.out.println("pin gresit");
//            }
//            i++;
//        }


        boolean isValid = isValid(correctPin);
        if (isValid) {
            System.out.println("pin corect");
        } else {
            System.out.println("pin gresit");
        }
    }

    public static boolean isValid(int correctPin) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userPin;
        while (i < 3) {
            userPin = scanner.nextInt();
            if (userPin == correctPin) {
                return true;
            }
            System.out.println("pin gresit");
            i++;
        }
        return false;
    }
}
