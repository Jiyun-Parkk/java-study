import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2480 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String nums = br.readLine();
    StringTokenizer str = new StringTokenizer(nums);
    int num1 = Integer.parseInt(str.nextToken());
    int num2 = Integer.parseInt(str.nextToken());
    int num3 = Integer.parseInt(str.nextToken());
    br.close();

    int[] numArr = {num1, num2, num3};

    int price = 0;
    int count = 0;
    int sameNum = 0;
    int max = 0;

    for(int i=0; i< numArr.length; i++) {
      if(i == 0) {
        if(numArr[i] == numArr[numArr.length - 1]){
          count +=1;
          sameNum = numArr[i];
        }

      } else {
        if(numArr[i] == numArr[i - 1]) {
          count += 1;
          sameNum = numArr[i];
        }
      }
      int max1 = Math.max(numArr[0], numArr[i]);
      if(max < max1) {
        max = max1;
      }

    }

    if(count == 3) {
      price = 10000 + (sameNum * 1000);
    } else if(count >= 1 && count < 3)  {
      price = 1000 + (sameNum * 100);
    } else {
      price = max * 100;
    }

    System.out.println(price);

  }

}
