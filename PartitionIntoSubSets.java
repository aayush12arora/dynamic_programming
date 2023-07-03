import java.util.Scanner;

public class PartitionIntoSubSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();// number of peoples
        int k = sc.nextInt();// number of teams to split in

        long [][] dp = new long[k+1][n+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if(j<i){// teams>people
                     dp[i][j]=0;
                }else if(i==j){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=   ( i*dp[i][j-1])+dp[i-1][j-1];
                }
            }
        }
System.out.println(dp[k][n]);
    }
}
