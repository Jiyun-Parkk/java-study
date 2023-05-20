package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10813 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer count = new StringTokenizer(br.readLine());
    int max = Integer.parseInt(count.nextToken());
    int lineCount = Integer.parseInt(count.nextToken());
    int[] balls = new int[max];

    for(int i = 0; i < max; i++) {
      balls[i] = i + 1;
    }

    for(int i = 0; i < lineCount; i++) {
      StringTokenizer baskets = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(baskets.nextToken());
      int b = Integer.parseInt(baskets.nextToken());
      int temp = balls[a - 1];
      balls[a - 1] = balls[b - 1];
      balls[b - 1] = temp;
    }
    for(int ball: balls) {
      System.out.print(ball + " ");
    }
  }

}
