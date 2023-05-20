import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2525 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String currentTime = br.readLine();
    StringTokenizer str = new StringTokenizer(currentTime);
    int currentHour = Integer.parseInt(str.nextToken());
    int currentMin = Integer.parseInt(str.nextToken());
    String cook = br.readLine();
    int cookTime = Integer.parseInt(cook);
    br.close();
    int finishHour = currentHour + (int) (Math.floor((cookTime + currentMin) / 60));
    int finishMin = (currentMin + cookTime) % 60;
    if(finishHour >= 24) finishHour -= 24;
    System.out.printf("%d %d", finishHour , finishMin);
  }
}
