//Program to check if given string is a palindrom
//A palindrome is a word, phrase, or sequence that reads the same backward as forward.

public class Palindrome {
    public static void main(String[] args){

        String s = "anana";
        boolean result = isPalindrome(s);
        System.out.println(s + " isPalindrome = " + result);
    }
    public static boolean isPalindrome(String s){
        if(s == null){
            return false;
        }
        if(s.length() <=1){
            return true;
        }
        String first = s.substring(0, 1);
        String last = s.substring(s.length()-1, s.length());
        if(!first.equals(last)){
            return false;
        }else{
            return isPalindrome(s.substring(1, s.length()-1));
        }
    }
}
