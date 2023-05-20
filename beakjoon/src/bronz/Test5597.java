package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test5597 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] checkNums = new int[30];
    for(int i = 0; i < 30; i++){
      if(i < 28) {
        int num = Integer.parseInt(br.readLine());
        checkNums[num - 1] = num;
      }

    }
    for(int i = 0; i < 30; i++){
      if(checkNums[i] == 0) {
        System.out.println(i + 1);
      }

    }





  }


}
