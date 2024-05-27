package strings;

public class Ex3 {

    //3. Scrie un program care citeste de la tastatura un String si il afiseaza in consola consola caracter cu caracter (cate un caracter pe fiecare linie)

    public static void main(String[] args) {
        String s = "Hello, World!";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }


    }
}
