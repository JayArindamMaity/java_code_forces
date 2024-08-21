import java.util.Scanner;

public class c263A {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[5][5];
        int row=0 , col=0 , ans=0;
        for (int i = 0 ; i<5 ; i++) {
            for (int j = 0 ; j<5 ; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(count(row) + count(col));
    }

    static int count(int r) {
        int counter = 0;
        if (r<2) {
            while (r<2) {
                r++;
                counter++;
            }
            return counter;
        }
        if (r>2) {
            while (r>2) {
                r--;
                counter++;
            }
            return counter;
        }
        return counter;
    }
}