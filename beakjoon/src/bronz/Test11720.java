package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11720 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    String nums = br.readLine();
    String[] numsArr = nums.split("");
    int sum = 0;
    for(int i = 0; i < count; i++) {
      int num = Integer.parseInt(numsArr[i]);
      sum += num;
    }
    System.out.println(sum);
  }


}
