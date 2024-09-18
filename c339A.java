import java.util.Scanner;

public class c339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r;
        r = sc.nextLine();
        int temp = 0;
        temp = (r.length())/2 + 1;
        char [] m = r.toCharArray();
        char [] c = new char[temp];
        temp = 0;
        for (int i = 0 ; i<m.length ; i+=2) {
            c[temp] = m[i];
            temp++;
        }
        java.util.Arrays.sort(c);
        for (int i = 0 ; i<c.length-1 ; i++) {
            System.out.print(c[i] + "+");
        }   
        temp = c.length-1;
        System.out.print(c[temp]);
        sc.close();
    }
}