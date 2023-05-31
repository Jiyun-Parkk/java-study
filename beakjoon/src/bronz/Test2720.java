package bronz;

import java.util.Scanner;

public class Test2720 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int quarter = 25;
    int dime = 10;
    int nickel = 5;
    int penny = 1;

    int[][] countArr = new int[count][4];

    for (int i = 0; i < count; i++) {
      int remainMoney = sc.nextInt();

      while (remainMoney > 0) {
        if (remainMoney >= quarter) {
          remainMoney -= quarter;
          countArr[i][0]++;
        } else if (remainMoney >= dime) {
          remainMoney -= dime;
          countArr[i][1]++;
        } else if (remainMoney >= nickel) {
          remainMoney -= nickel;
          countArr[i][2]++;
        } else {
          remainMoney -= penny;
          countArr[i][3]++;
        }
      }

    }

    for (int i = 0; i < countArr.length; i++) {
      for (int j = 0; j < countArr[i].length; j++) {
        System.out.printf("%d ", countArr[i][j]);
      }
      System.out.printf("%n");
    }
  }

}
