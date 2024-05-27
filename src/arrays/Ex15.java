package arrays;

public class Ex15 {
    public static void main(String[] args) {
        //15. Scrie un program care sa caute un numar de telefon intr-o lista de numere. Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”
        //input
        int phoneNumber = 3;
        int[] numberList = {1,2,3,4,5,6};

        if (isFound(phoneNumber, numberList)){
            System.out.println("numar gasit");
        } else{
            System.out.println("nu a fost gasit");
        }



    }

    public static boolean isFound (int phoneNumber, int[] numberList){

        //pentru fiecare numar din array
             //daca phoneNumber este egal cu numarul curent
                  //return true
        //return false
        for (int i = 0; i < numberList.length; i++) {
            if(phoneNumber == numberList[i]){
                return true;
            }
        }
        return false;

    }
}
