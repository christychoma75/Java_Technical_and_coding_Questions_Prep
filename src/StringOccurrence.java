//Programming to find occurrence of a letter in a string

public class StringOccurrence {
    public static void main(String[] args){
        String s = "programming is fun but difficult";

        //Initial string length
        int InitialStringLen = s.length();
        // length of a string after removing the specif letter occurrence
        int secondStringLen = s.replace("i", "").length();
        //count the total len
        int count = InitialStringLen - secondStringLen;

        System.out.println(count);

    }
}
