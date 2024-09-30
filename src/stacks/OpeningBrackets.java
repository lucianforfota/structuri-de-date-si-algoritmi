package stacks;

import java.util.*;

public class OpeningBrackets {

    //(([]()()){})
    //()(
    //((])
    //[(])

    public static void main(String[] args) {
        System.out.println(areBalancedBrackets("((])"));
    }

    public static boolean areBalancedBrackets(String s) {
        //parcurgem string-ul
        //daca caracterul curent este paranteza deschisa
        //bag pe stiva
        //daca carcaterul este paranteza inchisa
        //daca corespunde (ca forma) cu ultima paranteza de pe stiva
        //sterg de pe stiva ultimul caracter
        //altfel
        //return false
        //returnam true daca lungimea stivei este 0
        List<Character> stack = new ArrayList<>();
        List<Character> openBrackets = Arrays.asList('(', '[', '{');
        List<Character> closedBrackets = Arrays.asList(')', ']', '}');
        for (int i = 0; i < s.length(); i++) {
            char currentBracket = s.charAt(i);
            if (openBrackets.contains(currentBracket)) {
                stack.add(currentBracket);
            } else if (closedBrackets.contains(currentBracket) && corresponds(currentBracket, stack.getLast())) {
                stack.remove(stack.size() - 1);
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }


    public static boolean corresponds(Character closedBracket, Character openBracket) {
        //fac mapa cu asocierelie dintre paranteze
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put('(', ')');
        matchingBrackets.put('[', ']');
        matchingBrackets.put('{', '}');
        //returnez daca valoarea de la cheia openbracket este egala cu closedBracket
        return matchingBrackets.get(openBracket) == closedBracket;
    }
}
