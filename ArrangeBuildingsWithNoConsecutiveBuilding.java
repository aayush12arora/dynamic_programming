import java.util.Scanner;
//Given  n there are n plots on each side of road you are requred to return number of ways to arrange buildings so that no two buildings are consecutive  but two building can face each other on opposite side


// this is exactly similar to the string with no consecutive zeros
// just building are both side
// for one combinations on each side there are n possible options on other side  so total options are equal to say n combination on each side  so n^2 on both sides
public class ArrangeBuildingsWithNoConsecutiveBuilding {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int ocons=1;
int oconb=1;
for (int i = 0; i < n+1; i++) {
    int ncons= ocons+oconb;
    int nconb= ocons;
    oconb = nconb;
    ocons= ncons;
}
int oneside = oconb+ocons;
int total = oneside*oneside;
System.out.println(total);
    }
}
