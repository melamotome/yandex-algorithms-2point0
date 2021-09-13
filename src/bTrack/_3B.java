package bTrack;

import java.util.HashSet;
import java.util.Scanner;

public class _3B {
    private void run() {
        HashSet<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            if (set.contains(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            set.add(n);
        }
    }

    public static void main(String[] args) {
        new _3B().run();
    }
}
