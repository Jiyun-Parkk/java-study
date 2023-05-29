package silver;

import java.util.Scanner;

public class Test2941 {

  public static void main(String[] args) {
    String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
      for(int j = 0; j < croatia.length; j++) {
        if(str.contains(croatia[j])) {
          str = str.replaceAll(croatia[j], "0");
        }
      }
    System.out.println(str.length());
  }

}
