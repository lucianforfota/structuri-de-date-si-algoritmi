package strings;

public class Ex6 {

    public static void main(String[] args) {
        //6. Scrie un program care citeste de la tastatura un String si ii inverseaza caracterele.
        //De exemplu, String-ul "java" devine "avaj".

        String word = "java";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
             reversed += word.charAt(i);
        }
        System.out.println(reversed);


        char[] wordChars = word.toCharArray();


        for (int i = 0; i < wordChars.length/2; i++) {
            char temp = wordChars[i];
            wordChars[i] = wordChars[wordChars.length -i -1];
            wordChars[wordChars.length-i-1] = temp;
        }










    }
}
