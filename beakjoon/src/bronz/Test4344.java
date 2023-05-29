package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4344 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int caseCount = Integer.parseInt(br.readLine());
    double[] ratioArr = new double[caseCount];
    for(int i = 0; i < caseCount; i++) {
      String lines = br.readLine();
      StringTokenizer tokens = new StringTokenizer(lines);
      int students = Integer.parseInt(tokens.nextToken());
      int[] scores = new int[students];
      int sum = 0;
      double ave = 0;
      for(int j = 0; j < students; j++) {
        int score = Integer.parseInt(tokens.nextToken());
        sum += score;
        scores[j] = score;
      }
      ave = sum / students;
      int overAve = 0;
      for(int f = 0 ; f < students; f++) {
        if(scores[f] > ave) {
          overAve += 1;
        }
      }
      ratioArr[i] = ((double) overAve / (double) students) * 100;
    }
    for(int e = 0; e < ratioArr.length; e++) {
      System.out.printf("%.3f%s%n",ratioArr[e],"%");
    }
  }

}
