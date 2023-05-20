package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2908 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(new StringBuffer(token.nextToken()).reverse().toString()) ;
    int b = Integer.parseInt(new StringBuffer(token.nextToken()).reverse().toString()) ;

    if(a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }


  }

}
