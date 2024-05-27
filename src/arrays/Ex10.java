package arrays;

public class Ex10 {
    public static void main(String[] args) {
        //10. Scrie un program care afiseaza cate numere prime sunt intr-un array.


        //input
        int[] numbers = {4,5,6,3};
        //output
        int primeCounter = 0;

        //algoritmul

        //pentru fiecare numar din array (parcurgem array-ul)
            //daca este numar prim
                //incrementez primeCounter
        //afisez primeCounter

        boolean isPrime;


//        for (int i = 0; i < numbers.length; i++) {
//            isPrime = true;
//            for (int j = 2; j < numbers[i]; j++) {
//                if (numbers[i] % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                primeCounter++;
//            }
//
//        }

//        for (int i = 0; i < numbers.length; i++) {
//            if (isPrime(numbers[i])) {
//                primeCounter++;
//            }
//        }
        System.out.println("sunt " + countPrimes(numbers) + " numere prime");

    }

    public static int countPrimes (int[] numbers){
        int primeCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                primeCounter++;
            }
        }
        return primeCounter;
    }

    public static boolean isPrime(int number){
        //pentru fiecare numar i de la 2 pana la number-1
            //daca numarul numbers se imparte exact la i
                //return false
        //return true

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;

    }
}
