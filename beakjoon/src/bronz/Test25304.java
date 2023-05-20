package bronz;

import java.util.Scanner;

public class Test25304 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstSum = scanner.nextInt();
    int count = scanner.nextInt();
    int expectPrice = 0;
    for(int i = 0; i< count; i++) {
      int price = scanner.nextInt();
      int num = scanner.nextInt();
      expectPrice += (price * num);
    }
    String isCorrect = firstSum == expectPrice ? "Yes" :"No";
    System.out.println(isCorrect);
  }
}
