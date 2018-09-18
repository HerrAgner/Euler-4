package challenges.euler;

public class e7 {
    public static void main(String[] args) {
        int plats = 1;
        int[] primeList = new int[10001];
        primeList[0] = 2;

        for (int i = 1; plats < primeList.length; i+=2) {       //kollar om 1 är primtal, sen ökar den med två hela tiden.
            if (isPrime(i)) {
                primeList[plats] = i;
                plats++;
            }
        }

        for (int print : primeList) {           //printar ut listan med primes
            System.out.println(print);
        }

    }
    private static boolean isPrime (int n){    //returns true om talet är ett primtal.
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if ((n % 2 == 0) || (n % 3 == 0)) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

