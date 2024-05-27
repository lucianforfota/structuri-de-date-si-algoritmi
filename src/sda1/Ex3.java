package sda1;

public class Ex3 {
    public static void main(String[] args) {
        //3. Genereaza mesajele pentru sistemul de like-uri al Facebook-ului.
        //Ai la dispozitie ca si input un array cu numele persoanelor care au dat like (la ceva) si trebuie sa generezi textul corespunzator,
        // dupa regula pe care o deduci din urmatorul exemplu:

        //[] -> "no one likes this"
        //["Peter"] -> "Peter likes this"
        //["Jacob", "Alex"] -> "Jacbok and Alex like this"
        //["Max", "John", "Mark"] -> "Max, John and Mark like this"
        //["Alex", "Jacob", "Mark", "Max"] -> "Alex, Jacob and 2 others like this"

        String[] names = {"Peter", "Alex", "Jacob", "Mark", "Max"};
        System.out.println(getNotificationMessage(names));

    }

    public static String getNotificationMessage (String[] names){
        //daca names.length este 0

        if(names.length == 0){
            return "no one likes this";
        }else if (names.length==1){
            return names[0] + " likes this";
        } else if (names.length==2){
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length==3){
            return names[0]+ ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0]+ ", "+ names[1] + " and " + (names.length-2) + " others like this";
        }

    }
}