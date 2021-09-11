package bTrack;
//
//
//На Новом проспекте построили подряд 10 зданий. Каждое здание может быть либо жилым домом, либо магазином, либо офисным зданием.
//
//        Но оказалось, что жителям некоторых домов на Новом проспекте слишком далеко приходится идти до ближайшего магазина. Для разработки плана развития общественного транспорта на Новом проспекте мэр города попросил вас выяснить, какое же наибольшее расстояние приходится преодолевать жителям Нового проспекта, чтобы дойти от своего дома до ближайшего магазина.


import java.util.Scanner;

public class _2B {

    private int findMaxDist(int[] street) {
        int[] dist = new int[10];
        int currentShop = -20;
        for (int i = 0; i < 10; i++) {
            if (street[i] == 2) {
                currentShop = i;
            }
            if (street[i] == 1) {
                dist[i] = i - currentShop;
            }
        }
        int max = 0;
        currentShop = 30;
        for (int i = 9; i >= 0; i--) {
            if (street[i] == 2) {
                currentShop = i;
            }
            if (street[i] == 1) {
                int mindist = Math.min(dist[i], currentShop - i);
                max = Math.max(max, mindist);
            }
        }
        return max;
    }

    private void run() {
        Scanner s = new Scanner(System.in);
        int[] street = new int[10];
        for (int i = 0; i < 10; i++) {
            street[i] = s.nextInt();
        }
        System.out.println(findMaxDist(street));
    }

    public static void main(String[] args) {
        new _2B().run();
    }
}
