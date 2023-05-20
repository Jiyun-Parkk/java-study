package bronz;
import java.util.Arrays;
import java.util.Scanner;

public class Test10818 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int[] nums = new int[count];
    for(int i = 0; i < count; i++) {
      nums[i] = scanner.nextInt();
    }
    Arrays.sort(nums);
    System.out.printf("%d %d",nums[0],nums[count - 1]);
  }

}
