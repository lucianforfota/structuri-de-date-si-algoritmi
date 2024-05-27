package strings;

public class Ex5 {
    public static void main(String[] args) {
        //5. Scrie un program care sa afiseze toate string-urile care
        // au lungimea para dintr-un array de string-uri
        //De exemplu, pentru array-ul {“ana”, “home”, “an”} se va afisa: “home”, “an”

        String[] words = {"ana", "home", "an"};

        for (int i = 0; i < words.length; i++) {
            //daca lungimea este para
            if (words[i].length() % 2 == 0){
                System.out.println(words[i]);
            }

        }
    }
}
