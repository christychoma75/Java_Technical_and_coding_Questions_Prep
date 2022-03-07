//Program to find number in a string
public class findDigit {
    public static void main(String[] args){
        // get the number from a given string
        String sInput = "Fannie Interview round 2";

        String s = sInput.replaceAll("[^0-9]", "");
        System.out.println(s);

    }
}
