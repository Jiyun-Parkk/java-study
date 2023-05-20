package bronz;


import java.util.Scanner;

public class Test10950 {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    for(int i = 0; i < count; i++) {
      int one = scanner.nextInt();
      int two = scanner.nextInt();
      System.out.println(one + two);
    }

  }
}
