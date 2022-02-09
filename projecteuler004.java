package projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class projecteuler004 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        int number = 0;

        for (int i = 100; i<1000; i++){
            for (int j = i; j<1000; j++){
                number = i*j;
                String numberString = String.valueOf(number);
                String numberStringR = "";

                int length = numberString.length();
                for (int k = length - 1 ; k >= 0 ; k--)
                    numberStringR = numberStringR + numberString.charAt(k);

                if (numberString.equals(numberStringR)){
                    System.out.println(i + "*" + j +  " = " + number);
                     list.add(number);
                }


            }
        }

        for (Integer integer:list)
            System.out.print(integer + " ");

        System.out.println();
        System.out.println(list.get(list.size()-1));

    }
}
