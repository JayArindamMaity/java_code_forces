import java.util.Scanner;

public class c231A {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans = 0;
        while (T>0) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a + b + c >= 2) {
                ans++;
            }
            T--;            
        }
        System.out.println(ans);
        sc.close();
    }
}