package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test11022 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());
    String[] resultArr = new String[count];
    for(int i = 0; i < count; i++){
      String line = br.readLine();
      StringTokenizer token = new StringTokenizer(line);
      int a = Integer.parseInt(token.nextToken());
      int b = Integer.parseInt(token.nextToken());
      String str = String.format("Case #%d: %d + %d = %d", i+1, a,b,a+b);
      resultArr[i] = str;
    }
    br.close();
    for(int i = 0; i < count; i++) {
      bw.write(resultArr[i]);
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }

}
