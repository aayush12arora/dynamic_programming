import java.util.Scanner;

public class ZeroOneKackPackProblem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int capacity = sc.nextInt();
        int n = sc.nextInt();
        int[] value = new int[n];
        int[]weight = new int[n];
        for (int i = 0; i < value.length; i++) {
            value[i]=sc.nextInt();
        }
         for (int i = 0; i < weight.length; i++) {
            weight[i]=sc.nextInt();
        }

    int [][]dp = new int[n+1][capacity+1];
    for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[i].length; j++) {
            if(i==0||j==0){
                dp[i][j]=0;// for first column and row
            } else{
if(j>=weight[i-1]){
dp[i][j]=Math.max(dp[i-1][j], value[i-1]+dp[i-1][j-weight[i-1]]);// when it bats
}else{
    dp[i][j]=dp[i-1][j]; // when does not bat 
}

            }
        }
    }
System.out.println(dp[n][capacity]);

    }
}
