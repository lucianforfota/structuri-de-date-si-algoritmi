package pregatireinterviu;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

    //"---+++-+++-+"

    //++++
    //--++, +--+, ++--

    public static void main(String[] args) {
        System.out.println(generatePossibleStrings("++++"));
    }

    public static List<String> generatePossibleStrings(String s){
        //parcurg string-ul pana la penultimul
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            //daca caracterul curent si cel urmator sunt plusuri
            if(s.charAt(i)=='+' && s.charAt(i+1)=='+'){
                //fac un nou string in care inlocuiesc doar curentul si rumatorul cu minusuri si restul se pastreaza
                //bag string-ul in array-ul rezultat
                String newString = s.substring(0, i) + "--" + s.substring(i+2);
                result.add(newString);
            }
        }
        return result;
    }


    //fac un nou string in care inlocuiesc doar curentul si rumatorul cu minusuri si restul se pastreaza
         //iau din string substrig-ul de la inceput pana inainte de curent , la care adaug --, la care adaug substring-ul din string de dupa urmatorul pana la final


}


