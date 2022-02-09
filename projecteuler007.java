package projecteuler;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class projecteuler007 {
    private static int getPrime(){
        int count = 0,sayac = 0, sayi = 0;
        boolean found = true;
        while (found)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0)
            {
                count++;
                sayac++;
                if (count==10001)
                    found = false;
            }

            sayi++;
        }

        return sayi-1;
    }

    public static void main(String[] args) {
        System.out.println(getPrime());
    }

}
