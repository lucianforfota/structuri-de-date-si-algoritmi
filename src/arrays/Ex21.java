package arrays;

public class Ex21 {
    public static void main(String[] args) {
        //21. Scrie un program care sa inverseze elementele unui array. Adica vrei ca utilizatorul sa poata vedea o lista de preturi de la coada la cap:
        //De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola "9, 10, 3, 7, 1"

        int[] prices =  {1, 7, 3, 10, 9};

        int[] result = new int[prices.length];

        //parcurg array-uul pana la jumatate
        for (int i = 0; i < prices.length/2; i++) {

            //interschimba pozitiile opuse (in oglinda)
            swap(prices, i, prices.length-i-1);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }

    public static void swap (int[] prices, int index1, int index2 ){
        int temp = prices[index1];
        prices[index1] = prices[index2];
        prices[index2]= temp;
    }









    //parcurg invers pe prices
    //elemetul de la pozitia i il bag in result la pozitia 0

//        int j = 0;
//        for (int i = prices.length - 1; i >= 0; i--) {
//                result[j] = prices[i];
//                j++;
//        }


//        for (int i = prices.length - 1; i >= 0; i--) {
//            result[prices.length - i - 1] = prices[i];
//        }

//        for (int i = 0; i < prices.length; i++) {
//            result[prices.length - i - 1] = prices[i];
//        }

//        for (int i = 0; i < prices.length/2; i++) {
//            //interschimb elementul de la pozitia i cu cel de la length -i -1
//            int temp = prices[i];
//            prices[i] = prices[prices.length-i-1];
//            prices[prices.length-i-1]= temp;
//
//        }

}
