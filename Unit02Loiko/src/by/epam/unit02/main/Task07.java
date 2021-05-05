package by.epam.unit02.main;

public class Task07 {
    public static void main(String[] args) {
        int a, b, c;

        a = 4;
        b = -2;
        c = 3;

        System.out.printf("Исходный набор чисел: %d,%d,%d\n", a, b, c);
        if (a > 0) {
            a *= a;
        } else {
            a *= a * a * a;
        }
        if (b > 0) {
            b *= b;
        } else {
            b *= b * b * b;
        }
        if (c > 0) {
            c *= c;
        } else {
            c *= c * c * c;
        }

        System.out.printf("После возведения в степени: %d,%d,%d", a, b, c);
    }
}
