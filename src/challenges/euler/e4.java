package challenges.euler;

public class e4 {
    public static void main(String[] args) {
        int max = 0;
        int tal1 = 999;
        int tal2 = 999;
        String first;
        String second;
        int tal1Sista = 0;
        int tal2Sista = 0;
        int count = 1;

        while (tal2 >= 100) {
            String pal = Integer.toString(tal1 * tal2);
            //nollställer first och second
            first = "";
            second = "";

            //skapar första halvan av talet
            for (int j = 0; j < pal.length() / 2; j++) {
                first += pal.charAt(j);
            }
            //Skapar andra halvan av talet baklänges
            for (int j = pal.length() - 1; j >= pal.length() / 2; j--) {
                second += pal.charAt(j);
            }
            //Kollar om första talet är samma som andra baklänges
            if (first.equals(second)) {
                if (tal1 * tal2 > max) {
                    max = tal1 * tal2;
                    tal1Sista = tal1;
                    tal2Sista = tal2;
                }
            }
            //minskar värdet på tal1 och tal2
            if (tal1 >= 100) {
                tal1--;
            } else {
                tal2--;
                tal1 = 999 - count;
                count++;
            }
        }

        System.out.println(max);
        System.out.println(tal1Sista);
        System.out.println(tal2Sista);

    }
}