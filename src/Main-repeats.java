// для тренажера
public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length() - PATTERN.length() + 1; i++) {
            boolean match = true;
            for (int j = 0; j < PATTERN.length(); j++){
                if (TEXT.charAt(i + j) != PATTERN.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}
