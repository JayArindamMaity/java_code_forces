import java.util.Scanner;
import java.math.BigInteger;

public class c1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger row = sc.nextBigInteger();
        BigInteger col = sc.nextBigInteger();
        BigInteger til = sc.nextBigInteger();
            
        BigInteger len = row.divide(til).add(row.mod(til).equals(BigInteger.ZERO) ? BigInteger.ZERO : BigInteger.ONE);
        BigInteger bre = col.divide(til).add(col.mod(til).equals(BigInteger.ZERO) ? BigInteger.ZERO : BigInteger.ONE);
            
        System.out.println(len.multiply(bre));
        sc.close();
    }
}
