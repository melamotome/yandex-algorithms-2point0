package bTrack;
//
//
//В атриуме нового корпуса ФНК урбанисты установили модные гранитные лавочки (на которых холодно сидеть зимой и жарко летом). Лавочка устроена следующим образом: несколько одинаковых кубических гранитных блоков ставятся в ряд, а на них кладется гранитная плита.
//
//        При этом блоки располагаются так, чтобы плита не падала: для этого достаточно, чтобы и слева, и справа от центра плиты был хотя бы один гранитный блок или его часть (в частности, если центр плиты приходится на середину какого-нибудь блока, то и слева, и справа от центра плиты находится часть блока, и плита не падает).
//
//        На ФНК много певокурсников (но это только пока не произошли отчисления за списывания на курсе ОиМП) и им не хватает стульев в аудиториях. Студенты обнаружили, что блоки можно использовать в аудитории в качестве сиденья. Можно по одному вытаскивать блоки, находящиеся с краю (как слева, так и справа). Они хотят вытащить из-под лавочки как можно больше блоков так, чтобы она при этом не упала (передвигать оставшиеся блоки нельзя). Определите, какие блоки они должны оставить.
//
//
//В первой строке входных данных содержатся два числа: L - длина лавочки и K - количество гранитных блоков-ножек. Оба числа натуральные и не превышают 10 000.
//
//        Во второй строке следуют K различных целых неотрицательных чисел, задающих положение каждой ножки. Положение ножки определяется расстоянием от левого края плиты до левого края ножки (ножка - это куб размером 1×1×1). Ножки перечислены слева направо (то есть начиная с ножки с меньшим расстоянием до левого края).

import java.util.Scanner;

public class _2D {
    private void run() {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int k = s.nextInt();
        int prev = s.nextInt();
        boolean answered = false;
        if (k == 1) {
            System.out.println(prev);
        }
        for (int i = 1; i < k; i++) {
            int current = s.nextInt();
            if (current == l / 2 && l % 2 != 0) {
                System.out.println(current);
                answered = true;
            }
            if (current >= l / 2 && !answered) {
                System.out.println(prev + " " + current);
                answered = true;
            }
            prev = current;
        }
    }

    public static void main(String[] args) {
        new _2D().run();
    }
}