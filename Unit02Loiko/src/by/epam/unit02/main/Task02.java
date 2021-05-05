package by.epam.unit02.main;

public class Task02 {
    public static void main(String[] args) {
        int x;
        int y;
        int tmp;

        x = 4;
        y = 234;

        if (x < y) {
            tmp = y;
            y = x;
            x = tmp;
        }
        System.out.println("Значение x: " + x + "\nЗначение y: " + y);
    }
}
