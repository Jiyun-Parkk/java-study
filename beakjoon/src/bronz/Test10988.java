package bronz;

import java.util.Scanner;

public class Test10988 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String reverse = new StringBuilder(str).reverse().toString();
    int result = reverse.equals(str) ? 1 : 0;
    System.out.println(result);
  }

}
