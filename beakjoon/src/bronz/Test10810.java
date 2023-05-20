package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10810 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer count = new StringTokenizer(br.readLine());
    int totalBall = Integer.parseInt(count.nextToken());
    int totalLine = Integer.parseInt(count.nextToken());
    int[] balls = new int[totalBall];

    for(int i = 0; i < totalLine; i++) {
      StringTokenizer nums = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(nums.nextToken());
      int b = Integer.parseInt(nums.nextToken());
      int c = Integer.parseInt(nums.nextToken());
      int smaller = a;
      int big = b;
      if(a > b) {
        smaller = b;
        big = a;
      }
      for(int j = smaller - 1; j < big; j++) {
          balls[j] = c;
      }
    }
    for(int num: balls) {
      System.out.print(num + " ");
    }
  }

}
