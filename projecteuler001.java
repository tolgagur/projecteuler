package projecteuler;
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class projecteuler001 {

    public static void main(String[] args) {
        System.out.println(sum(1000));
    }

    public static int sum(int number){
        int sum=0;
        for (int i = 0;i<number;i++){
            if (i%3==0 || i%5==0){
                System.out.print(i + " ");
                sum=sum+i;
            }

        }
        return sum;
    }
}
