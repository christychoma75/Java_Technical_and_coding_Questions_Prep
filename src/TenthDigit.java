public class TenthDigit {
    public static void main(String[] args) {
        long number = 1123654789;

        //converting the integer input to string data
        String strNum =  String.valueOf(number);

        char indexOf = strNum.charAt(9);
        if(indexOf % 2 ==0){
            System.out.println(indexOf + "is even");
        }else if(indexOf % 2 != 0){
            System.out.println(indexOf + "is odd");
        }

    }
}
