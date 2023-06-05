public class Skilltree {

  public static void main(String[] args) {
    // 1. skill을 배열로 저장한다
    String skill = "CBD";
    String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
    String[] skillArr = skill.split("");
    int count = 0;

    // 2. 문자열을 비교하여 카운팅을 한다
    for(int i = 0; i < skill_trees.length; i++) {
      String[] strArr = skill_trees[i].split("");
      boolean isCorrect = true;
      int index = 0;
      for(int j = 0; j < strArr.length; j++) {
        if(!skill.contains(strArr[j])) {
          continue;
        } else if(strArr[j].equals(skillArr[index])) {
          index++;
        } else {
          isCorrect = false;
        }
      }
      if(isCorrect || strArr.length == 0) {
        count += 1;
      }
    }
    System.out.println(count);
  }

}
