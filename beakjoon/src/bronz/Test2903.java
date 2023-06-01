package bronz;

import java.util.Scanner;

public class Test2903 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int point = 2;

    // 2 3 5 9 17 33
    //   1 2 3 4  5
    for (int i = 0; i < count; i++) {
      point = point + (point - 1);
    }

    System.out.println((int) Math.pow(point, 2));
  }


}
