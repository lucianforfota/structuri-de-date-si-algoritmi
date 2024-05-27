package sda1;

public class Ex1 {

    public static void main(String[] args) {
        //### 1. Scrie un program care sa calculeze cum vei vopsi un gard
        //
        //Avem un gard format din n scanduri, n fiind citit de la tastatura. n trebuie sa fie minim 3.
        //
        //Un copil vopseste cu culoarea rosie din 2 in 2 scanduri (prima scandura colorata cu rosu este scandura 2),
        // iar alt copil vopseste cu culoarea albastra din 3 in 3 scanduri (prima scandura colorata cu albastru este scandura 3).
        //Scandura 1 ramane nevopsita.
        //
        //Exista posibilitatea ca o scandura sa fie violet, atunci cand cand ambii copii o vopsesc
        // (de exemplu, scandura 6 va fi vopsita de ambii copii).
        //
        //Calculeaza (din cele n scanduri) cate scanduri vopsite cu albastru vor fi, cate scanduri vopsite cu rosu vor fi,
        // cate scanduri vopsite cu violet vor fi,
        // si cate scanduri nevopsite vor fi.

        int n = 152;

        int red = 0;
        int blue = 0;
        int purple = 0;
        int noPaint = 0;

        //parcurge numerele scandurilor de la 1 la n
        //daca numarul scandurii curent se imparte la 2 si la 3
        //incrementam violet
        //altfel daca numarul scandurii curent se imparte la 2
        //incrementez red
        //altfel daca numarul scandurii curent se imparte la 3
        //incremenred blue
        //altfel
        //incrementez noPaint

        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0 && i % 3 ==0){
                purple++;
            } else if (i % 2 ==0){
                red++;
            } else if (i%3 ==0){
                blue++;
            } else{
                noPaint++;
            }
        }
        System.out.println(red + " rosii " + blue + " albasttre " + purple + " violet "+ noPaint + " nevopsite ");
    }
}
