package bTrack;

import java.util.Scanner;

public class _1C {

    private int isDefiniteDate(int a, int b, int year) {
        if (a > 12 || b > 12) return 1;
            else return 0;
    }

    private void run() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int year = s.nextInt();
        System.out.println(isDefiniteDate(a, b, year));
    }

    public static void main(String[] args) {
        new _1C().run();
    }
}
