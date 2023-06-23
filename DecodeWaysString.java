import java.util.Scanner;

public class DecodeWaysString {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String in = sc.next();

    int dp[]= new int[in.length()];

    dp[0]=1;
    for (int i = 1; i < dp.length; i++) {
        if(in.charAt(i-1)=='0'&&in.charAt(i)=='0'){
            dp[i]=0;

        }else if(in.charAt(i-1)=='0'&&in.charAt(i)!='0'){
dp[i]=dp[i-1];
        }
        else if(in.charAt(i-1)!='0'&&in.charAt(i)=='0'){
            if(in.charAt(i-1)=='1'||in.charAt(i-1)=='2'){
dp[i]=i>=2?dp[i-2]:1;
            }else{
                dp[i]=0;
            }

        }else{
            if(Integer.parseInt(in.substring(i-1, i+1))<=26){
dp[i]=dp[i-1]+ (i>=2?dp[i-2]:1);
            }else{
                dp[i]=dp[i-1];
            }
        }
    }
    System.out.println(dp[dp.length-1]);
 }   
}
