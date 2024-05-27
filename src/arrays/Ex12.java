package arrays;

public class Ex12 {

    public static void main(String[] args) {
        //12. Scrie un program care sa afiseze de cate ori apare un anumit numar n intr-un array.
        //De exemplu, pentru {1, 2, 2, 3, 3, 3, 4, 4, 4, 4} si n=3, se va afisa "3 apare de 3 ori".

        //input
        int n = 3;
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        //output
        int counter = 0;

        //pentru fiecare numar din array (parcurg array-ul)
            //daca numarul n este egal cu numarul curent din array
                //incrementez counter
        //afisez counter


        System.out.println(countOccurences(n,numbers));

    }


    public static int countOccurences(int n, int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]){
                counter++;
            }
        }
        return counter;
    }
}
