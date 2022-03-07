//check if two string are anagram;
//Anagram is if two words or strings are made of similar character and similar number of character

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1 = "stop";
        String s2 = "pops";

        char[] arr1=s1.toLowerCase().toCharArray();
        char[] arr2=s2.toLowerCase().toCharArray();
        System.out.println(arr1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }
}
