import java.util.Scanner;
class AllPossiblePathsfromTopLeftToBottomRight{
static int possibleways(int m, int n){
// Using Combinatorics formula (m+n-2)C(m-1) or (m+n-2)C(n-1)
int paths = 1;
for (int i = 1; i < Math.min(m, n); i++) {
paths = paths * (m + n - 1 - i) / i;
}
return paths;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the M value: ");
int m=s.nextInt();
System.out.println("Enter the N value: ");
int n=s.nextInt();
System.out.println(possibleways(m, n));
s.close();
}
}