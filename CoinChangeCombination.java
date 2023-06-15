import java.util.Scanner;

public class CoinChangeCombination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] coins  = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i]=sc.nextInt();
        }
        int amount = sc.nextInt();

        int dp[]= new int[amount+1];
        dp[0]=1;

        for(int i =0;i<n;i++){
            for (int j = coins[i]; j < dp.length; j++) {
               dp[j]+=dp[j-coins[i]];             
            }
        }

        System.out.println("ways to pay"+amount+" "+" are "+ dp[amount]);

    }
}