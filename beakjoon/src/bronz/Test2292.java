package bronz;
import java.util.Scanner;

public class Test2292 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int groupId = 1;
    int count = 2;

    while(count <= num) {
      count = count + (6*groupId);
      groupId++;
    }
    System.out.println(groupId);

  }
}
