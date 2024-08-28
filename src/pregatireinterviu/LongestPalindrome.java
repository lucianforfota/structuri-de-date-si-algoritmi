package pregatireinterviu;

public class LongestPalindrome {


    //bababfg
    //babab

    //gaseste toate substring-urile

    //gaseste toate substing-urile care sunt palindroame
         //folosesc o functie care imi daca un string este palindrom sau nu

    //gaseste pe cel mai lung dintre ele (algoritm de maxim)

    public static void main(String[] args) {
        findLongestSubPalindrome("babafg");
    }

    public static boolean isPalindrome(String s){
        return true;
    }


    public static String findLongestSubPalindrome(String s){
        int maxLength = 0;
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i,j+1);
                if (isPalindrome(substring)){
                    if (substring.length()>maxLength){
                        maxLength = substring.length();
                        longestPalindrome = substring;
                    }
                }
            }
        }
        return longestPalindrome;

    }
}




























