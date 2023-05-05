import java.util.Arrays;
import java.util.Random;

public class LottoStore {

  // REVIEW: 인스턴스 변수에 접근제어자와 생성자를 활용해보세요.
  Random random = new Random();
  boolean[] checkArray = new boolean[45];

  public Lotto createLotto() {
    int[] lottoNum = new int[6];
    int bonusNum = 0;
    int index = 0;
    int getNum;
    while (lottoNum[5] == 0 || bonusNum == 0) {
      getNum = random.nextInt(45);
      if(checkArray[getNum]) {
        continue;
      }
        checkArray[getNum] = true;
        if(index < lottoNum.length) {
          lottoNum[index] = getNum + 1;
          index += 1;
        } else {
          bonusNum = getNum + 1;
        }
    }
    return new Lotto(lottoNum, bonusNum);
  }

  public Lotto[] issueLotto(int n) {
    Lotto[] issuedLotto = new Lotto[n];
    for (int i = 0; i < n; i++) {
      issuedLotto[i] = createLotto();
    }
    return issuedLotto;
  }

  public Lotto issueWinLotto() {
    return createLotto();
  }

  public void printResult(Lotto myLotto, Lotto winLotto) {
    int[] getMyNumbers = myLotto.getNumbers();
    int[] getWinNumbers = winLotto.getNumbers();
    int getMyBonusNumber = myLotto.getBonusNumber();
    int getWinBonusNumber = winLotto.getBonusNumber();
    int winLevel = 0;
    int count = 0;
    boolean isBonus = getMyBonusNumber == getWinBonusNumber;

    for (int winNumber: getWinNumbers) {
      for(int myNumber: getMyNumbers) {
        if (winNumber == myNumber) {
          count += 1;
        }
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
