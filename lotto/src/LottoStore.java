import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoStore {

  /**
   * 로또 발행 Random class 사용해서 번호 만들기 중복 처리를 어떻게 할지 고민해보세요 (참고: boolean 배열 활용, new boolean[46];)
   *
   * @param n 로또 발행 개수
   * @return n개의 로또
   */

  // random 하게 6개의 번호 추출
  // random 중에 중복 숫자가 있으면 건너띄고 새로운 번호 발행

  // Lotto 클래스 array [찍은번호], bonus번호
  Random random = new Random();
  Boolean[] checkArray = new Boolean[45];

  public Lotto createLotto() {
    int[] lottoNum = new int[7];
    int index = 0;
    int getNum;
    while (lottoNum[6] == 0) {
      getNum = random.nextInt(44) + 1;
      if (checkArray[getNum] == null) {
        checkArray[getNum] = true;
        lottoNum[index] = getNum;
        index += 1;
      }
    }
    return new Lotto(Arrays.copyOfRange(lottoNum, 0, 6), lottoNum[6]);
  }

  public Lotto[] issueLotto(int n) {
    Lotto[] issuedLotto = new Lotto[n];

    for (int i = 0; i < n; i++) {
      issuedLotto[i] = createLotto();
    }
    return issuedLotto;
  }

  /**
   * 당첨 로또 발행
   *
   * @return 당첨번호를 가진 로또
   */
  public Lotto issueWinLotto() {
    return createLotto();
  }

  /**
   * 당첨 여부 판단 결과 출력
   *
   * @see <a href="https://t1.daumcdn.net/cfile/tistory/99E25A3359FB2FF62D">로또 당첨 참고</a>
   */
  public void printResult(Lotto myLotto, Lotto winLotto) {
    int[] getMyNumbers = myLotto.getNumbers();
    int[] getWinNumbers = winLotto.getNumbers();
    int getMyBonusNumber = myLotto.getBonusNumber();
    int getWinBonusNumber = winLotto.getBonusNumber();
    int winLevel = 0;
    int count = 0;
    boolean isBonus = false;
    List<int[]> winNumList = new ArrayList<>(Arrays.asList(getWinNumbers));

    if (getMyBonusNumber == getWinBonusNumber) {
      isBonus = true;
    }
    for (int i = 0; i < getMyNumbers.length; i++) {
      if (winNumList.contains(getMyNumbers[i])) {
        count += 1;
      }
    }
    switch (count) {
      case 6:
        winLevel = 1;
        break;
      case 5:
        winLevel = isBonus ? 2 : 3;
        break;
      case 4:
        winLevel = 4;
        break;
      case 3:
        winLevel = 5;
        break;
    }
    System.out.printf("당신의 로또:%s 당신의 보너스번호: %d%n", Arrays.toString(getMyNumbers), getMyBonusNumber);
    System.out.printf("당첨된 로또:%s 당첨된 보너스번호: %d%n", Arrays.toString(getWinNumbers),
        getWinBonusNumber);
    String result = winLevel == 0 ? "꽝" : winLevel + "등";
    // 1등 6개, 2등 5개 + 보너스, 3등 5개, 4등 4개, 5등 3개
    System.out.printf("%d개 맞췄습니다. 보너스번호 %s. %s 입니다 %n", count, isBonus ? "맞음" : "틀림", result);
  }

}
