package arrays;

public class Ex11 {
    public static void main(String[] args) {
        //11. Scrie un program care sa calculeze produsul numerelor impare dintr-un array

        //initial produsul este 1
        //pwntru fiecare numar din array (parcurgem array-ul)
           //daca numarul este impar
              //inmultesc la produs
        //afisez produsul

        int[] numbers = {2,3,4,5,6};
        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (isOdd(numbers[i])) {
                product *= numbers[i];
            }
        }

        System.out.println(product);
    }


    public static boolean isOdd (int number){

       return number % 2 == 1;
    }
}
