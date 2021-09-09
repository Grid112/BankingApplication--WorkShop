package coreJavaAndFunctions;

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        int HeadFlip = 1;
        int COUNT = 100;
        double heads = 0;
        double tails = 0;
        for (int i = 1; i <= COUNT; i++) {
            Random random = new Random();
            int coin = random.nextInt(2);
            if (coin == HeadFlip) {
                System.out.println("Heads");
                heads += 1;
            }
            else {
                System.out.println("Tails");
                tails += 1;
            }
        }
        System.out.println("percentage of Heads : " + ((heads / COUNT) * 100) + "%");
        System.out.println("percentage of Tails : " + ((tails / COUNT) * 100) + "%");
    }
}
