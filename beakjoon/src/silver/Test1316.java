package silver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test1316 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int lines = scanner.nextInt();
    // 입력줄만큼 반복문을 돌린다.
    int count = 0;
    for(int i = 0; i< lines; i++) {
      String str = scanner.next();
      HashMap<Character, ArrayList> map = new HashMap<>();
      for(int j = 0; j < str.length(); j++) {
         if(map.get(str.charAt(j)) == null) {
           map.put(str.charAt(j), new ArrayList());
         }
         ArrayList<Integer> indexArr =  map.get(str.charAt(j));
         indexArr.add(j);
         map.put(str.charAt(j),indexArr);
      }
      boolean isMatch = true;
      for(char key: map.keySet()) {
        if(map.get(key).size() > 1) {
          for(int f = 0; f < map.get(key).size(); f++) {
            if(f > 0 ) {
              int curr = (int) map.get(key).get(f) - 1;
              int before = (int) map.get(key).get(f - 1);
              if(curr != before) {
                isMatch = false;
              }
            }
          }
        }
      }
      if(isMatch) count += 1;
    }
    System.out.println(count);

  }

}
