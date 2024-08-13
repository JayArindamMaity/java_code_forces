import java.util.Scanner;

public class c158A {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = 0;
        int targ = 0;
        int temp = 0;
        int ansr = 0;
        
        size = sc.nextInt();
        targ = sc.nextInt();
        int [] arr = new int [size];
        
        for (int i = 0 ; i<size ; i++) {
            temp = sc.nextInt();
            arr[i] = temp;
        }

        for (int i = 0 ; i<size ; i++) {
            if (arr[i] >= arr[targ - 1] && arr[i] > 0) {
                ansr++;
            }
        }

        System.out.println(ansr);

        sc.close();
    }
}