package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2738 {

  public static void main(String[] args)  throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String lines = br.readLine();
    StringTokenizer tokensLine = new StringTokenizer(lines);
    int count = Integer.parseInt(tokensLine.nextToken());
    int count2 = Integer.parseInt(tokensLine.nextToken());
    int[][] list1 = new int[count][count2];
    int[][] list2 = new int[count][count2];

    for(int i = 0; i < count*2; i++) {
      String nums = br.readLine();
      StringTokenizer tokens = new StringTokenizer(nums);
      if(i < count) {
        for(int j = 0; j < count2; j++) {
          int getNum = Integer.parseInt(tokens.nextToken());
          list1[i][j] = getNum;
        }
      } else {
        for(int f = 0; f < count2; f++) {
          int getNum = Integer.parseInt(tokens.nextToken());
          list2[i - count][f] = getNum;
        }
      }
    }

    for(int i = 0; i < count; i++) {
      for(int j = 0; j < count2; j++){
        System.out.printf("%d ",list1[i][j] + list2[i][j]);
      }
      System.out.printf("%n");
    }
  }

}
