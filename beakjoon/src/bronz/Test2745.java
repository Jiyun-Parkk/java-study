package bronz;

import java.util.Scanner;

public class Test2745 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int B = sc.nextInt();
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      // 아스키코드에서 A - Z를 10 ~ 35를 만든다
      int alpha = str.charAt(str.length() - 1 - i) - 55;
      // 10보다 작은 경우에는 7을 더해서 10진법으로 만들준다.
      if(alpha < 10) {
        alpha += 7;
      }
      result += (Math.pow(B, i) * alpha);
    }
    System.out.println(result);
  }

}
