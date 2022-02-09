package projecteuler;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class projecteuler003 {
    public static void main(String[] args) {

        long number=600851475143L;

        for(int counter=2;counter<=Math.sqrt(number);counter++)
        {
            if(number%counter==0)
            {
                number=number/counter;
                counter--;

            }
        }
        if(number>=2)
            System.out.println("Largest Prime Factor :"+number);

    }
//    public static Long factors(Long number){
//        List<Long> list = new ArrayList<>();
//
//        for (long i = 2; i<number; i++){
//            int sayac = 0;
//            if (number%i == 0){
//                for(long j = 2; j < i; j++)
//                {
//                    if(i % j == 0) {
//                        sayac++;
//                    }
//                }
//                if (sayac==0)
//                    list.add(i);
//            }
//
//        }
//        return list.get(list.size()-1);
//    }



}
