public class BBCroulette {
    public static void main(String[] args) {
        int money = 0;
        int rand;
        int wins = 0;

        // in 1000 iterations
        for (long i = 0; i < 1000000000; i++)
        {
            rand = (int) (Math.random() * 36);
            if (rand == 20)
            {
                wins++;
                money += 7200;
            }
            else
            {
                money -= 200;
            }
             // System.out.println(rand);
        }

        System.out.println("wins = " + wins);
        System.out.println("loses = " + (1000000000 - wins) );
        System.out.println("money won: " + money);
    }
}
