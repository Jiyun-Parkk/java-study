package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2563 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 색종이 한칸을 1로 정한다
    // 100 100 이차원 배열을 만든다
    boolean[][] total = new boolean[100][100];
    // 숫자를 입력받는다 첫번째는 입력줄 수다
    int count = scanner.nextInt();

    // 줄수 만큼 반복문을 돌린다
    for(int i = 0; i < count; i++) {
      // 각줄의 x y를 구한다
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      //total 배열을 수정한다
      for(int j = x; j < x+10; j++) {
        for(int f = y; f < y+10; f++) {
          total[j][f] = true;
        }
      }
    }
    int territory = 0;
    for(int i = 0; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        if(total[i][j]) {
          territory++;
        }
      }
    }
    System.out.println(territory);

  }



}

