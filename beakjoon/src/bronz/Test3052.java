package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test3052 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] remains = new int[10];
    for(int i = 0; i < remains.length; i++) {
      remains[i] = Integer.parseInt(br.readLine()) % 42;
    }
   remains = Arrays.stream(remains).distinct().toArray();
    System.out.println(remains.length);
  }

}
