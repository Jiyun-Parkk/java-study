import java.io.*;
import java.util.StringTokenizer;

public class Test11382  {
  // Scanner 보다 buffer가 빠른 이유는 8배 메모리 만큼 버퍼를 가지고 있기 때문
//  public static void main(String[] args)  throws IOException {
  public void method() throws IOException {
    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    String nums = br.readLine();
    StringTokenizer numsToken = new StringTokenizer(nums);

    long a = Long.parseLong(numsToken.nextToken());
    long b = Long.parseLong(numsToken.nextToken());
    long c = Long.parseLong(numsToken.nextToken());

    br.close();
    System.out.println(a + b + c);
  }
//  }
}
