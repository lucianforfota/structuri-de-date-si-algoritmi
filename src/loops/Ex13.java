package loops;

public class Ex13 {

    public static void main(String[] args) {
        //### 13. Scrie un program care afiseaza daca un numar este, sau nu, palindrom,
        // numarul fiind citit de la tastatura.
        //
        //Un numar este palindrom daca ramane la fel atunci cand cifrele ii sunt inversate.
        //De exemplu, numarul 12321 este palindrom deoarece atunci cand e inversat, este tot 12321.

        //input
        int n = 42323;
        //inversam numarul
        //verificam daca numarul original este acelasi cu numarul inversat
        //daca da, afisam mesajul "palindrom"
        //aletfel
        //afisam mesajul "nu este palindrom"

        int reversed = reverseNumber(n);
        if (reversed == n){
            System.out.println("palindrom");
        } else{
            System.out.println("nu este palindrom");
        }
    }

    public static int reverseNumber(int n){
        int lastDigit;
        int reversed = 0;
        while (n > 0){
            //extrag ultima cigfra

            lastDigit = n % 10;
            reversed = reversed*10 + lastDigit;
            //retunut la ultima cifra
            n = n/10;
        }
        return reversed;
    }
}