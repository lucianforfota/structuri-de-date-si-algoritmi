package strings;

public class Ex19 {

    public static void main(String[] args) {
        //19. Implementeaza o parte din jocul Scrabble.
        //In scrabble, fiecare cuvant are un punctaj bazat pe suma punctelor
        // echivalente fiecarei litere din cuvant.
        //De exemplu, cuvantul "code" are 7 puncte
        // (c valoreaza 3 puncte, o -> 1 punct, d -> 2 puncte, e -> 1 punct).
        //Citeste de la tastatura 2 cuvinte si afiseaza-l pe cel care are mai multe puncte (cuvantul castigator).
        //Foloseste-te de acest array care reprezinta scorul fiecarei litere in alfabet, de la A la Z.\
        //

        int[] letterScores = {1, 3, 3, 2, 1};
        char[] letters ={'A', 'B', 'C', 'D', 'E'};


        String word1 = "ABCD";
        String word2 = "BBBDE";

        //calculez scorul primului cuvant
        //calculez scorul al doilea cuvant
        //comparam scorurile si afisam un mesaj corespunzator


        int score1 = calculateScore(word1, letterScores, letters);
        int score2 = calculateScore(word2, letterScores, letters);

        if (score1>score2){
            System.out.println("cuvantul " + word1);
        } else if (score2>score1) {
            System.out.println("cuvantul " + word2);

        } else{
            System.out.println("egal");
        }
    }

    public static int calculateScore(String word, int[] letterScores, char[] letters){
        int score = 0;
        for (int i = 0; i < word.length(); i++){
            //aflu in variabila pozition pozitia caracterului curent in letters
            int position = getPosition(letters, word.charAt(i));
            //accesez lettersScores[pozition] (adica punctajul)
            //adun punctajul la score
            score += letterScores[position];
        }
        return score;
    }

    public static int getPosition(char[] letters, char c){
        for (int i = 0; i < letters.length; i++) {
            if (c == letters[i]){
                return i;
            }
        }
        return -1;
    }
}
