package projecteuler;
/*
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class projecteuler006 {

    private static double SumSquare(){
        Long sumCount = 0L;
        Long sum = 0L;

        for (int i = 1; i<=100;i++){
            sum = sum + i*i;
            sumCount = sumCount + i;

        }
        Long aLong = sumCount*sumCount-sum;


        return aLong;
    }

    public static void main(String[] args) {
        System.out.println(SumSquare());
    }
}
