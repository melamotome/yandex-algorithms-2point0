package bTrack;
//
//
//На координатной плоскости расположены равнобедренный прямоугольный треугольник ABC с длиной катета d и точка X. Катеты треугольника лежат на осях координат, а вершины расположены в точках: A (0,0), B (d,0), C (0,d).
//
//        Напишите программу, которая определяет взаимное расположение точки X и треугольника. Если точка X расположена внутри или на сторонах треугольника, выведите 0. Если же точка находится вне треугольника, выведите номер ближайшей к ней вершины.

import java.util.Scanner;

public class _1E {

    private int whereIsX(int d, int x, int y) {
        //prints 0 if x is inside, if outside - 1 closer to A, 2 B, 3 C
        if (x >= 0 && y >= 0 && x + y <= d) return 0;
            else {
            int d1 = x * x + y * y;
            int d2 = (x - d) * (x - d) + y * y;
            int d3 = x * x + (y - d) * (y - d);
            if (d1 <= d2 && d1 <= d3) return 1;
                else if (d2 <= d3) return 2;
                    else return 3;
        }
    }

    private void run() {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(whereIsX(d, x, y));
    }

    public static void main(String[] args) {
        new _1E().run();
    }
}
