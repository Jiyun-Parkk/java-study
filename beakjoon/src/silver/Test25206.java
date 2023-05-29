package silver;
import java.util.HashMap;
import java.util.Scanner;

public class Test25206 {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Double> scoreMap = new HashMap<>();
    String[] grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
    Double[] aves = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
    for(int i = 0; i< grade.length; i++) {
      scoreMap.put(grade[i],aves[i]);
    }
    double sum = 0;
    double total = 0;
    for(int i = 0; i < 20; i++) {
      String[] str = scanner.nextLine().split(" ");
      double score = 0;
      if(!str[2].equals("P")) {
        score = Double.parseDouble(str[1]) * scoreMap.get(str[2]);
        total += Double.parseDouble(str[1]);
      }
      sum += score;
    }
    System.out.printf("%.6f",sum / total);
  }


}
