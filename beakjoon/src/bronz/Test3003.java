package bronz;

import java.util.Scanner;

public class Test3003 {

  public static void main(String[] args) {
    int[] chess = {1,1,2,2,2,8};
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < chess.length; i++) {
      int num = Integer.parseInt(scanner.next());
      int check = chess[i] - num;
      System.out.print(check + " ");
    }
  }

}
