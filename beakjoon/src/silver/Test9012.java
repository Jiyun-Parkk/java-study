package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test9012 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < count; i++) {
      String str = br.readLine();

      for (int j = 0; j < str.length(); j++) {
        char c = str.charAt(j);
        if (c == '(') {
          stack.push(c);
        } else {
          if (stack.size() == 0) {
            stack.push(c);
            break;
          } else {
            stack.pop();
          }
        }
      }
      if (stack.isEmpty()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

      stack.clear();
    }


  }

}
