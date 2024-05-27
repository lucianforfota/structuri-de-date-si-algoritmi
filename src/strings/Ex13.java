package strings;

public class Ex13 {
    public static void main(String[] args) {
        //13. Scrie un program care sa numere literele, spatiile, numerele,
        // si celelalte caractere dintr-un String. (folositi metodele String-ului)
        //De exemplu, pentru “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”,
        // se va afisa in consola: "23 litere, 9 spatii, 8 numere, 6 alte caractere".
        //Foloseste-te de metodele disponibile in lucrul cu caractere:
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html

        String s = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";

        //initial nr de litere 0
        //initial nr de spatii 0
        //initial nr de numere 0
        //initial nr de alte caractere 0
        //parcrug string-ul caracter cu caracter
        //daca este litera
        //litera++;
        //altfel daca este cifra
        //cifra++;

        int nrLetters = 0;
        int nrWhitespaces = 0;
        int nrNumbers = 0;
        int nrSpecialCharacters = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (Character.isLetter(currentCharacter)) {
                nrLetters++;
            } else if (Character.isWhitespace(currentCharacter)) {
                nrWhitespaces++;
            } else if (Character.isDigit(currentCharacter)) {
                nrNumbers++;
            } else {
                nrSpecialCharacters++;
            }

        }

        System.out.println(nrLetters + " litere " + nrWhitespaces + " spatii ");
    }
}
