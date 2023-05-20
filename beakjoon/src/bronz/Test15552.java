package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test15552 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());
    int[] sumArr = new int[count];
    for(int i = 0; i < count; i++) {
      String nums = br.readLine();
      StringTokenizer numStr = new StringTokenizer(nums);
      int a = Integer.parseInt(numStr.nextToken());
      int b = Integer.parseInt(numStr.nextToken());
      sumArr[i] = a + b;
    }
    for(int i = 0; i < count; i++) {
      bw.write(String.valueOf(sumArr[i]));
      bw.newLine();
    }
    br.close();
    bw.flush();
    bw.close();
  }

}
