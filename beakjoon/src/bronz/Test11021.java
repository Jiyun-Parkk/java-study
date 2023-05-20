package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test11021 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());
    int[] numsArr = new int[count];
    for(int i = 0; i < count; i++) {
      String line = br.readLine();
      StringTokenizer token = new StringTokenizer(line);
      int a = Integer.parseInt(token.nextToken());
      int b = Integer.parseInt(token.nextToken());
      numsArr[i] = a + b;
    }
    br.close();
    for(int i = 0; i < count; i++) {
      String formaString = String.format("Case #%d: %d",i + 1,numsArr[i]);
      bw.write(formaString);
      bw.newLine();
    }
    bw.flush();
    br.close();
  }

}
