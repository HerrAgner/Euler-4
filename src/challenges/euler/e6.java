package challenges.euler;

public class e6 {
    public static void main(String[] args) {
        int sumOfSquare = 0;
        int squareOfSum = 0;


        for (int i = 1; i<= 100; i++) {      //summan av alla kvadrater
            sumOfSquare += i*i;
        }

        for (int j = 1; j <= 100; j++) {     //summan av alla termer
            squareOfSum += j;
        }
        squareOfSum *= squareOfSum;         //Kvadraten av summan av termerna

        System.out.printf("Skillnaden mellan summan av alla kvadrater och kvadraten av summan är %d - %d = %d", squareOfSum, sumOfSquare, (squareOfSum - sumOfSquare));



    }
}


//  The sum of the squares of the first ten natural numbers is,
//  1^2 + 2^2 + ... + 10^2 = 385
//  The square of the sum of the first ten natural numbers is,
//  1 + 2 + ... + 10)^2 = 55^2 = 3025
//  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.