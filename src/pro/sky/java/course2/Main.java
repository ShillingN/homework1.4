package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
        int i = 2021;
        int firstI = i - 200;
        int lastI = i + 100;
        for (i = firstI; i <= lastI; i++) {
            if (i % 79 == 0 ) {
                System.out.println("В этом году " + i + "-м появится комета.");

            }

        }

        int j = 1;
        for (; j <= 30; j++) {
            if (j % 3 == 0 & j % 5 == 0) {
                System.out.println("ping-pong");
            } else if (j % 3 == 0) {
                System.out.println("ping");
            } else if (j % 5 == 0) {
                System.out.println("pong");
            }
        }
    }
}
