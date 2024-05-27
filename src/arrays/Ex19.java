package arrays;

public class Ex19 {

    public static void main(String[] args) {


        //19. Scrie un program care sa verifica daca un array este sortat crescator

        int[] numbers = {1,2,3,4,5,6,7};

        //pentru fiecare numar din array
            //daca numarul de la pozitia i (numarul curent este mai mare decat cel de la pozitia i+1
                 //break

        if (isSorted(numbers)){
            System.out.println("sortat");
        } else {
            System.out.println("nserotat");
        }

    }

    public static boolean isSorted (int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]){
                return false;
            }
        }
        return true;
    }
}
