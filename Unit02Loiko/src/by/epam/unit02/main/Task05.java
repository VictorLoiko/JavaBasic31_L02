package by.epam.unit02.main;

public class Task05 {
    public static void main(String[] args) {
        int x, y;
        double tmp;
        double result;

        x = 2;
        y = 3;

        tmp = Math.cos(x) - Math.sin(y);
        if (tmp == 0) {
            System.out.println("Знаменатель = 0");
        } else if (x * y == (Math.PI / 2)) {
            System.out.println("Значение под тангенсом = PI/2");
        } else {
            result = (Math.sin(x) + Math.cos(y)) / tmp * Math.tan(x * y);
            System.out.println("Результат: " + result);
        }
    }
}
