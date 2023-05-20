package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test5622 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Character,Integer> map = new HashMap<>();
    String str = br.readLine();
    int count = 0;
    int index = 3;
    for(char i = 'A'; i <= 'Z'; i++ ) {
      count += 1;
      map.put(i,index);
      if(count == 19 || count == 22) {
        index += 1;
      }
      if(count < 16 && count % 3 == 0) {
        index += 1;
      }
    }
    int sum = 0;
    for(int i = 0; i < str.length(); i++) {
      sum += map.get(str.charAt(i));
    }
    System.out.println(sum);

  }

}
