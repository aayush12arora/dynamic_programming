import java.util.Scanner;
// see the video 
public class APBCPTypeSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a=0;
        int ab=0;
        int abc =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(0)=='a'){
a= 2*a+1;
            }else  if(s.charAt(0)=='b'){
ab= 2*ab+a;

            }
            else  if(s.charAt(0)=='c'){
abc= a*abc+ab;
            }
        }
        System.out.println(abc);
    }
}
