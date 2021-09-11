package bTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2A {

    private void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        List<Integer> numbers = new ArrayList<>();
        while (n != 0) {
            if (n > max) {
                max = n;
            }
            numbers.add(n);
            n = s.nextInt();
        }
        int nOfMax = 0;
        for (Integer number : numbers) {
            if (number == max) {
                nOfMax++;
            }
        }
        System.out.println(nOfMax);
    }

    public static void main(String[] args) {
        new _2A().run();
    }
}
