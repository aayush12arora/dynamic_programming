import java.util.Scanner;

public class CoinChangePermutation {
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
        
        
            for (int amt = 1; amt < dp.length; amt++) {
                for(int coin:coins){
                    if(amt>=coin){
int remainingAmount = amt - coin;
                    dp[amt]+= dp[remainingAmount];
                    }
                }
                   
            }
        

        System.out.println("Permutations to pay"+amount+" "+" are "+ dp[amount]);
    }
}
