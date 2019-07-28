import java.util.*;

public class Main {
    boolean solve2(String[] args) {
        int[] stat = new int[26];
        for (String arg : args) {
            stat[arg.charAt(0) - 'A']++;
            stat[arg.charAt(arg.length() - 1) - 'A']++;
        }
        for (int i = 0; i < stat.length; i++) {
            if (stat[i] % 2 != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");
            String[] strs = new String[tokenizer.countTokens()];
            for (int i = 0; i < strs.length && tokenizer.hasMoreTokens(); i++) {
                strs[i] = tokenizer.nextToken();
            }
            System.out.println(m.solve2(strs));
        }
    }
}
