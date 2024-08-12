import java.util.Scanner;

public class c71A {
  public static void main(String [] args){
    java.util.Scanner sc = new Scanner(System.in);
    int runner;
    runner = sc.nextInt();
    while (runner >= 0){
      String usr_inp = sc.nextLine();
      System.out.println((usr_inp.length()<=10) ? usr_inp : (usr_inp.charAt(0) + "" + Integer.toString(usr_inp.length() - 2)  +"" + usr_inp.charAt(usr_inp.length() - 1)));
      runner--;
    }
    sc.close();
  }
}

