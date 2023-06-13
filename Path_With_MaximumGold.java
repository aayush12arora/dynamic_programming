import java.util.Scanner;

public class Path_With_MaximumGold {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int arr[][]= new int[m][n];
Integer dp[][]= new Integer[m][n];
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
arr[i][j]= sc.nextInt();
} 
}


for (int j = dp[0].length-1; j >=0; j--) {
for (int i = dp.length-1; i >=0; i--) {
    if(j==dp[i].length-1){
        dp[i][j]= arr[i][j];
    }
    else if(i==0){
dp[i][j]= arr[i][j]+Math.max(arr[i][j+1],arr[i+1][j+1]);
    }else if(i==dp.length-1){
dp[i][j]= arr[i][j]+Math.max(arr[i][j+1],arr[i-1][j+1]);
    }
        
    else{
dp[i][j]= arr[i][j]+Math.max(arr[i][j+1], Math.max(arr[i-1][j-1], arr[i+1][j+1]) );
    }
}

}


// search for maximum  value in first column
int max =0;
for (int i = 0; i < dp.length; i++) {
max = Math.max(max, dp[i][0]);
}

System.out.println(max);
}   
}
