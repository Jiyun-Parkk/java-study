package bronz;

import java.io.*;
import java.util.StringTokenizer;

public class Main  {
  public static void main(String[] args)  throws IOException {
    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    String time = br.readLine();
    StringTokenizer timeSet = new StringTokenizer(time);

    br.close();

    int hour = Integer.parseInt(timeSet.nextToken());
    int min = Integer.parseInt(timeSet.nextToken());


    if(min < 45){
      hour -= 1;
      min = 60 - (45 - min);
    } else {
      min = min - 45;
    }
    if(hour < 0) hour = 23;


    System.out.printf("%d %d",hour, min);


  }
}