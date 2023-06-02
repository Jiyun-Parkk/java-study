package silver.에디터;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Test1406 {


  private static final String L = "L";
  private static final String D = "D";
  private static final String B = "B";
  private static final String P = "P";


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String inputString = br.readLine();
    int commandCount = Integer.parseInt(br.readLine());
    // 연결 리스트 생성
    LinkedList<String> strList = new LinkedList<>();

    // 처음 커서는 맨뒤

    for (String string : inputString.split("")) {
      strList.add(string);
    }
    ListIterator<String> iter = strList.listIterator(strList.size());

    for (int i = 0; i < commandCount; i++) {
      String command = br.readLine();
      StringTokenizer token = new StringTokenizer(command);
      String commnder = token.nextToken();
      String extraString = "";
      if(token.hasMoreTokens()) {
        extraString = token.nextToken();
      }
      if (commnder.equals(L)) {
        if(iter.hasPrevious()) {
            iter.previous();
        }
      } else if(commnder.equals(D)) {
        if(iter.hasNext()) {
          iter.next();
        }
      } else if(commnder.equals(B)) {
        if(iter.hasPrevious()) {
          iter.previous();
          iter.remove();
        }
      } else if (commnder.equals(P)) {
          iter.add(extraString);
      }
    }
    for (String str : strList) {
      bw.write(str);
    }
    bw.flush();
    bw.close();
    br.close();
    // 커서는 포인터

  }


}
