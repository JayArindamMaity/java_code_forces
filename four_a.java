import java.util.Scanner;

public class four_a {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num%2 != 0) {
      System.out.println("NO");
    }
    else if ((num/2)%2==0) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
    sc.close();
  }
}
