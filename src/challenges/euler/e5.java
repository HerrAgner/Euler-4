package challenges.euler;

public class e5 {
    public static void main(String[] args) {
        int produkt;
        int tal = 20;


        while (true) {
            int check = 1;
            for (int j = 2; j <= 20; j++) {
                if (tal % j != 0) {
                    check = 1;
                    break;
                }
                check++;
            }
            if (check == 20) {
                produkt = tal;
                break;
            }
            tal += 20;
        }
        System.out.println(produkt);

    }
}

//  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?