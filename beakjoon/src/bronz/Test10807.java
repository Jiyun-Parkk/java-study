package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10807 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    String nums = br.readLine();
    StringTokenizer token = new StringTokenizer(nums);
    int checkNum = Integer.parseInt(br.readLine());
    int isCorrect = 0;
    for(int i = 0; i < count; i++) {
      int num = Integer.parseInt(token.nextToken());
      if(num == checkNum) {
        isCorrect += 1;
      }
    }
    System.out.println(isCorrect);
  }

}
