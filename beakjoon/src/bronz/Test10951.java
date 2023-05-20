package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10951 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String line;
    StringTokenizer token;
    while((line = br.readLine()) != null) {
      token = new StringTokenizer(line, " ");
      int a = Integer.parseInt(token.nextToken());
      int b = Integer.parseInt(token.nextToken());

      sb.append(a + b).append('\n');
    }
    System.out.println(sb);
  }
}
