package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10811 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());
    int total = Integer.parseInt(str.nextToken());
    int count = Integer.parseInt(str.nextToken());
    int[] nums = new int[total];
    for(int i = 0; i < total; i++) {
      nums[i] = i + 1;
    }
    for(int i = 0; i < count; i++) {
      StringTokenizer basket = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(basket.nextToken());
      int b = Integer.parseInt(basket.nextToken());
      if(a != b) {
        for(int j = a - 1; j < b; j++){
          for(int f = a - 1; f < b; f++) {
            if( j < f) {
              int temp = nums[j];
              nums[j] = nums[f];
              nums[f] = temp;
            }
          }
        }
      }
    }
    br.close();
    for(int num: nums) {
      System.out.print(num + " ");
    }
  }

}
