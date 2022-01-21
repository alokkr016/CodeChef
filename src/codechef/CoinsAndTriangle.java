package codechef;

import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n > 0) {
                int coins = s.nextInt();
                int count = 0;
                int i = 1;
                while (i <=  coins) {
                    int val = i * (i + 1);
                    if (val > 2 * coins) {
                        break;
                    }
                    i++;
                    count++;
                }
                System.out.println(count);
                n--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
