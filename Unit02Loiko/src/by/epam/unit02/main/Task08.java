package by.epam.unit02.main;

public class Task08 {
    public static void main(String[] args) {
        int x, y;
        boolean lower, upper;

        x = 5;
        y = -3;

        lower = !(x == 0 && y == -1) && ((y <= 0) && (y >= -3) && (x >= -4) && (x <= 4));
        upper = (y <= 4 && y > 0 && x >= -2 && x <= 2);

        System.out.println(lower || upper);
    }
}
