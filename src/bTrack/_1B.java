package bTrack;
//Витя работает недалеко от одной из станций кольцевой линии Московского метро, а живет рядом с другой станцией той же линии. Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу, чтобы добраться с работы домой.
import java.util.Scanner;

public class _1B {

    private int minNOfStations(int n, int big, int small) {
        //Make sure big has the biggest number of the two
        if (big < small) {
            int temp = big;
            big = small;
            small = temp;
        }
        int d1 = big - small;
        int d2 = small + n - big;
        if (d1 < d2) return d1 - 1;
            else return d2 - 1;
    }

    private void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int j = s.nextInt();
        System.out.println(minNOfStations(n, i, j));
    }

    public static void main(String[] args) {
        new _1B().run();
    }
}
