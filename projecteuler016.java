package projecteuler;

import java.math.BigInteger;

public class projecteuler016 {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("2");
        big = big.pow(1000);
        String num = big.toString();
        System.out.println(num);
        int result = 0;
        for(char i : num.toCharArray()) {
            result += Integer.parseInt(String.valueOf(i));
        }
        System.out.println(result);
    }
}
