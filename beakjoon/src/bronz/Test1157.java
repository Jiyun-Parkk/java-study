package bronz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test1157 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] str = scanner.nextLine().split("");
    HashMap<String, Integer> map = new HashMap<>();

    for(int i = 0; i < str.length; i++) {
      if(map.get(str[i].toLowerCase()) == null) {
        map.put(str[i].toLowerCase(),0);
      }
     int value = map.get(str[i].toLowerCase());
      map.put(str[i].toLowerCase(),value + 1);
    }

    ArrayList<String> keys = new ArrayList<>();
    Integer[] values = map.values().toArray(new Integer[0]);
    int max = 0;
    for(int i = 0; i < values.length; i++) {
      if(max < values[i]) {
        max = values[i];
      }
    }
    for(String key: map.keySet()) {
      if(map.get(key).equals(max)) {
        keys.add(key);
      }
    }
    String result = "";
    if(keys.size() > 1) {
      result = "?";
    } else {
      result = keys.get(0).toUpperCase();
    }
    System.out.println(result);
  }

}
