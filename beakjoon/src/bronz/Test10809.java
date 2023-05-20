package bronz;

import java.util.Scanner;

public class Test10809 {

  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    String str = scanner.nextLine();

    for(char i ='a'; i<='z'; i++) {
      int index = -1;
      if(str.indexOf(i) >= 0) {
        index = str.indexOf(i);
      }
      System.out.print(index + " ");
    }


  }

}
