package bTrack;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class _3A {
    private void run() {
        Scanner s = new Scanner(System.in);
        String[] list1 = s.nextLine().split("\\s+");
        int count = 0;
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, list1);
        String[] list2 = s.nextLine().split("\\s+");
        for (String value : list2) {
            if (set.contains(value)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new _3A().run();
    }
}
