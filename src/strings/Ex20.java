package strings;

public class Ex20 {

    //### 20. Implementeaza jocul Spanzuratoarea.
    //
    //Tu, ca jucator, ai posibilitatea sa incerci sa ghicesti cuvinte intre 5 si 8 litere.\
    //Jocul va avea o lista cu cuvinte predefinite pe care le poti ghici, atat cu 5, cat si cu 6-7-8 litere.\
    //De la tastatura se va citi numarul de litere - adica din cate litere sa fie cuvantul pe care sa il ghiceasca utilizatoul.\
    //\
    //Creeaza o functie chooseWord() care alege din lista de cuvinte predefinite un cuvant care sa aiba
    // numarul de litere egal cu numarul citit de la tastatura.\
    //Acesta va fi cuvantul secret, care trebuie ghicit.
    //
    //Utilizatorul are 6 incercari sa ghiceasca cuvantul secret. Aceste incercari se vor citi de la tastatura.
    // La fiecare incercare, va primi un hint (afisat in consola).\
    //Creeaza o functie getHint() care returneaza un hint in functie de incercarea utilizatorului.\
    //Hint-ul va fi un cuvant format din dublul numarului de caractere ale incercarii utilizatorului.\
    //Pentru fiecare litera din incercarea data de utilizator, se va mai alatura o un nou caracter imediat dupa:
    //
    //- Daca litera din incercare este aceeasi cu litera din cuvantul secret, de la aceeasi pozitie, atunci in hint
    // se va pune litera din incercare urmata de caracterul "#".\
    //Asta semnifica faptul ca utilizatorul a ghicit acea litera. Este exact in locul potrivit.
    //- Daca litera din incercare exista in cuvantul secret, doar ca in alta pozitie, atunci in hint se va pune
    // litera din incercare urmata de caracterul "?".\
    //Asta semnifica faptul ca utilizatorul a ghicit litera, doar ca este la alta pozitie.
    //- Daca litera din incercare nu exista in cuvantul secret, atunci in hint se va pune litera din incercare
    // urmata de caracterul "_".\
    //Asta semnifica faptul ca utilizatorul nu a ghicit deloc litera.\
    //
    //Exemplu pentru cuvantul secret "since":
    //
    //- Daca utilizatorul introduce in prima incercare cuvantul crash, i se va printa ca hint : c?r_a_s?h_
    //- Daca utilizatorul introduce in a doua incercare cuvantul scone, i se va printa ca hint : s#c?o_n?e#
    //- Daca utilizatorul intrduca in a 3-a incercare cuvantul since, i se va printa ca hint: s#i#n#c#e si jocul va lua sfarsit.

    public static void main(String[] args) {
        String guess = "since";
        //repet o bucla de 6 ori
        //citesc de la tastatura cuvantul utilizatorului (word)
        //daca guess egal cu word
        //printez ai casitat
        //ies din bucla
        //altfel
        //apelez si printez rezultatul lui getHint

    }

    public static String getHint (String word, String guess){
        String hint = "";
        //parcurg word
        //daca litera curenta este egala cu litera din guess de la aceeasi pozitie
        //adaug la hint litera curenta si diez
        //altfel daca guess contine litera curenta
        //adaug la hint litera curenta si ?
        //altfel
        //adaug la hint litera curenta si _

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == guess.charAt(i)){
                hint+= word.charAt(i)+ "#";
            } else if (guess.indexOf(word.charAt(i)) >= 0){
                hint+= word.charAt(i)+ "?";
            } else{
                hint+= word.charAt(i)+ "_";
            }

        }
        return hint;
    }
}
