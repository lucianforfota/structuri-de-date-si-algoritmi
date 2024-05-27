package arrays;

public class Ex17 {

    //17. Scrie un program care sa afiseze cel mai mare pret dintr-o lista de preturi.
    //De exemplu, pentru {1, 7, 3, 10, 9}, se vor afisa in consola valorile 1 si 10

    public static void main(String[] args) {

        int[] prices = {1,3,7,2,5,9,4};

        int maxPrice = Integer.MIN_VALUE;

        //pentru fiecare pret din lista de preturi
           //daca numarul curent este mai mare decat maximul
              //maximul devine numarul curent

//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] > maxPrice){
//                maxPrice = prices[i];
//            }
//        }
//        System.out.println(maxPrice);


        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        System.out.println(minPrice);

    }

}
