package loops;

public class Ex20 {
    //20. Creeaza un sistem automat de dat rest.
    //Atunci cand dai rest pentru un produs, vrei sa minimizezi numarul de monede pe care le dai ca rest.
    //Daca ai de ales ca pentru suma de 50 de centi sa dai rest 2 monede de 25 de centi, sau 5 monede de 10 centi, vei alege prima varianta.
    //Avem la dispozitie monede de 25 centi, 10 centi, 5 centi, 1 cent.
    //Sa luam inca un exemplu:
    //
    //Daca restul este de 41 de centi, vrei sa ii dai o moneda de 25 de centi.
    //Mai raman 16 centi, asa ca ii mai dai o moneda de 10 centi (cea mai mare ca valoare pe care poti sa i-o dai)
    //Mai raman 6 centi, asa ca ii mai dai o moneda de 5 centi
    //Mai ramane 1 cent, asa ca ii mai dai o moneda de 1 cent In total 4 monede.
    //Programul trebuie sa citeasca de la tastatura valoarea restului si sa afiseze de cate monede este nevoie pentru a da rest, respectand algoritmul din exemplu.
    //Programul nu trebuie sa afiseze de cate monede de fiecare tip este nevoie, ci de cate monede in total (chiar daca vor fi monede de tipuri diferite).\
    //
    //HINT: porneste cu un pseudocod, care poate arata asa:
    //
    //// citesc de la tastatura valoarea restului, in centi
    //// calculez cate monede de 25 pot sa ii dau si le adun la numarul total de monede
    //// scad valoarea monedelor de 25 din valoarea restului
    //// calculez cate monede de 10 pot sa ii dau si le adun la numarul total de monede
    //// scad valoarea monedelor de 10 din centii ramasi de dat ca rest
    //// calculez cate monede de 5 pot sa ii dau si le adun la numarul total de monede
    //// scad valoarea monedelor de 5 din centii ramasi de dat ca rest
    //// calculez cate monede de 1 pot sa ii dau si le adun la numarul total de monede
    //// scad valoarea monedelor de 1 din centii ramasi de dat ca rest
    //// afisez numarul total de monede
    //Testeaza codul la final:
    //
    //pentru input -1, programul iti cere sa introduci din nou o valoare?
    //pentru input 0, afiseaza programul 0?
    //pentru input 4, afiseaza programul 4?
    //pentru input 5, afiseaza programul 1?
    //pentru input 24, afiseaza programul 6?
    //pentru input 25, afiseaza programul 1?
    //pentru input 26, afiseaza programul 2?
    //pentru input 99, afiseaza programul 9?


    public static void main(String[] args) {

        int change = 24;
        int numberOfCoins = 0;

        int bani25 = 25;
        int bani10 = 10;
        int bani5 = 5;
        int bani1 = 1;

        //la counter adaug change / 25
        //change devine change modulo 25
        //la counter adaug change / 10
        //change devine change modulo 10
        //la counter adaug change / 5
        //change devine change modulo 5
        //adaug change la counter

        numberOfCoins += change/bani25;
        change = change % 25;
        numberOfCoins += change/bani10;
        change = change % 10;
        numberOfCoins += change/bani5;
        change = change % 5;
        numberOfCoins += change;

    }

}
