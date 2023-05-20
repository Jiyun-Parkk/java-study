package bronz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test11718 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> strArr = new ArrayList<>();
    String str;

    while((str = br.readLine()) != null) {
      strArr.add(str);
    }
    for(int i = 0; i < strArr.size(); i++) {
      System.out.println(strArr.get(i));
    };
  }

}
