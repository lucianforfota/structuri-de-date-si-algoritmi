package strings;

public class Ex4 {
    public static void main(String[] args) {
        //4. Scrie un program care sa inlocuiasca fiecare animal care incepe cu litera "B" cu "Lion", intr-un array de animale.
        //De exemplu, array-ul {"Aardvark", "Bear", "Bobcat", "Cheetah", "Dog"} va deveni {"Aardvark", "Lion", "Lion", "Cheetah", "Dog"}

        String[] animals = {"Aa2dvark", "Bear", "Bobcat", "Cheetah", "Dog"};

        int[] numbers = {1,2,3,4,4};
        //pentru fiecare string din array
            //daca elementul curent incepe cu b
            //elementul curent devine lion


        for (int i = 0; i < animals.length; i++) {
            if (animals[i].charAt(0) == 'B'){
                animals[i] = "Lion";
            }
        }



    }
}
