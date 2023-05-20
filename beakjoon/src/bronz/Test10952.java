package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test10952 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    while(true) {
      StringTokenizer str = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(str.nextToken());
      int b = Integer.parseInt(str.nextToken());
      if(a == 0 && b == 0) {
        break;
      }
      sb.append(a + b).append('\n');
    }
    System.out.println(sb);
  }

}
