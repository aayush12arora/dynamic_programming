import java.util.Scanner;

public class UnboundedKnacPack {
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


        // 2d array prevents duplicacy
        int []dp = new int[capacity+1];
dp[0]=0;
        for (int i = 1; i < dp.length; i++) {
            int max=0;
            for (int j = 0; j < n; j++) {
                if(i>=weight[j]){
                    max = Math.max(max, value[j]+dp[i-weight[j]]);
                }
            }
            dp[i]=max;
        }

        System.out.println(dp[capacity]);
    }
}
