import java.util.Scanner;

public class c282A {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0 , T;
        T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            String str = sc.nextLine();
            if (str.charAt(1) == '+') {
                ans++;
            } else {
                ans--;
            }
            T--;
        }
        System.out.println(ans);
        sc.close();
    }
}