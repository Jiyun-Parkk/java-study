package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2566 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0;
    int firstIndex = 0;
    int secondIndex = 0;
    for(int i = 0; i < 9; i++) {
      String str = br.readLine();
      StringTokenizer token = new StringTokenizer(str);
      for(int j = 0; j <9; j++) {
        int num = Integer.parseInt(token.nextToken());
        if(num > max) {
          max = num;
          firstIndex = i;
          secondIndex = j;
        }
      }
    }

    System.out.println(max);
    System.out.printf("%d %d", firstIndex + 1,secondIndex + 1);
  }

}
