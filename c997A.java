import java.util.Scanner;

public class c997A {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        while (b>0) {
            if (a%10 == 0) {
                a = a/10;
            }
            else {
                a--;
            }
            b--;
        }
        System.out.print(a);
        sc.close();
    }
}
