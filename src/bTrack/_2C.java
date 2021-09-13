package bTrack;

import java.util.Scanner;

public class _2C {

    private int costToPalindrome(String s) {
        int cost = 0;
        if (s.length() == 0 || s.length() == 1) {
            return cost;
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                cost++;
            }
        }

        return cost;
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(costToPalindrome(s));
    }

    public static void main(String[] args) {
        new _2C().run();
    }
}
