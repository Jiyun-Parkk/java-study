package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test9086 {

  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int count = Integer.parseInt(br.readLine());
//    String[] strArr = new String[count];
//    for(int i = 0; i < count; i++) {
//      String str = br.readLine();
//      strArr[i] = str;
//
//    }
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    String[] strArr = new String[count];
    for(int i = 0; i < count; i++) {
      String str = scanner.next();
      strArr[i] = str;

    }

    for(int i = 0; i < count; i++) {
      System.out.printf("%s%s%n",strArr[i].charAt(0), strArr[i].charAt(strArr[i].length() - 1));

    }


  }

}
