package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test11005 {

  public static void main(String[] args) throws IOException {
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int b = scanner.nextInt();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    StringTokenizer token = new StringTokenizer(line);
    int n = Integer.parseInt(token.nextToken());
    int b = Integer.parseInt(token.nextToken());


    ArrayList<Character> remainList = new ArrayList<>();

    while (n > 0) {
      if(n % b >= 10) {
        remainList.add((char) (n % b -10 + 'A'));
      } else {
        remainList.add((char) (n % b + '0'));
      }
      n /= b;
    }
    for (int i = remainList.size() - 1; i >= 0; i--) {
      System.out.print(remainList.get(i));
    }
  }

}
