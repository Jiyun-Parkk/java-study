
public class Joystick {
    public static void main(String[] args) {
        String name = "JAN";
        int answer = 0;
        int index = name.length() - 1;
        for(int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int endA = i + 1;
                while(endA < name.length() && name.charAt(endA) == 'A') {
                    endA++;
                }
                index = Math.min(index, i * 2 + (name.length() - endA));
                index = Math.min(index, i + (name.length() - endA) * 2);
            }
        }
        System.out.println(answer);
    }
}
