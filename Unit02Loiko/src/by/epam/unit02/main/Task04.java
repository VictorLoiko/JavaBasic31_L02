package by.epam.unit02.main;

public class Task04 {
    public static void main(String[] args) {
        int x1, x2;
        int y1, y2;
        double length;

        x1 = 3;
        y1 = 4;

        x2 = 1;
        y2 = 2;

        length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Расстояние между точками = " + length);
    }
}
