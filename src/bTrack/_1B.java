package bTrack;
//Витя работает недалеко от одной из станций кольцевой линии Московского метро, а живет рядом с другой станцией той же линии. Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу, чтобы добраться с работы домой.
import java.util.Scanner;

public class _1B {

    private int minNOfStations(int n, int big, int small) {
        int d1 = Math.abs(big - small) - 1;
        int d2 = Math.abs(n - 2 - d1);
        return Math.min(d1, d2);
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
