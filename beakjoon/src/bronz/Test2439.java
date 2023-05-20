package bronz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test2439 {

  public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   int count = Integer.parseInt(br.readLine());
   for(int i = 0; i < count; i++) {
     String star = "";
      for(int j = 0; j <= i; j++) {
         star+="*";
      }
     String stars = String.format("%" +count+"s", star);
      bw.write(stars);
      bw.newLine();
   }
   br.close();
   bw.flush();
   bw.close();
  }

}
