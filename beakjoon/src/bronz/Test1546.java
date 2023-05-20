package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1546 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    StringTokenizer str = new StringTokenizer(br.readLine());
    double max = 0;
    double[] scores = new double[count];
    for(int i = 0; i < count; i++) {
      double score = Double.parseDouble(str.nextToken());
      scores[i] = score;
      if(score > max) {
        max = score;
      }
    }
    double totalsum = 0;
    for(int i = 0; i < count; i++) {
      scores[i] = (scores[i] / max) * 100;
      totalsum += scores[i];
    }
    System.out.println(totalsum / count);
  }

}
