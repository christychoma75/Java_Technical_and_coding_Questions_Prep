//Program to find the fourth-largest number in a large array

public class largestNum {
    public static void main(String[] args){
        int[] array = {1, 14, 2, 16, 10, 20};

        //Initialize Variable
        int maximum = 0;
        int secondMax = 0;
        int thirdMax = 0;

        //Iterate through the loop to find the maximum number
        //using for each
        for(int i: array){
            //check for the maximum
            if(maximum < i){
                //assign thirdMax and secondMax
                thirdMax = secondMax;
                secondMax = maximum;
                maximum = i;
            }//check of second Max
            else if(secondMax < i){
                //assign thirdMax
                thirdMax = secondMax;
                secondMax = i;
            } //check for THIRD MAXIMUM NUMBER
            else if(thirdMax < i){
                thirdMax = i;
            }
        }
        System.out.println("The largest maximum number is: " + thirdMax);

    }
}
