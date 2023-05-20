package bronz;

import java.util.Scanner;

public class Test2444 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int lines = (2 * num) - 1;
      for(int i = 0; i < num - 1; i++) {
        for(int j = 0; j < num + i; j++) {
          int star = ((2*i) + 1);
          int space = (num + i) - star;
          if(j < space){
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        }
        System.out.printf("%n");
    }
    for (int i = 0; i < lines; i++) {
      System.out.print("*");
    }
    System.out.printf("%n");
    for(int i = num - 2; i >= 0 ; i--) {//3210
      for(int j = 0; j  < num + i; j++) { // 0~7
        int star = ((2*i) + 1); //  7
        int space = (num + i) - star; // 1
        if(j < space){
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.printf("%n");
    }
  }

}
