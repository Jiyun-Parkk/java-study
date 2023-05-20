package bronz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test2675 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    for(int i = 0; i < count; i++){
      int copy = scanner.nextInt();
      String str = scanner.next();

      for(int j = 0; j < str.length(); j++) {
        for(int f = 0; f < copy; f++){
          System.out.print(str.charAt(j));
        }
      }
      System.out.printf("%n");
    }
  }

}
