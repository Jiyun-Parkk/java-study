package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10871 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(br.readLine());
    int length = Integer.parseInt(token.nextToken());
    int checkNum = Integer.parseInt(token.nextToken());
    StringTokenizer nums = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < length; i++) {
      int num = Integer.parseInt(nums.nextToken());
      if(num < checkNum) {
        System.out.print(num + " ");
      }
    }
  }

}
