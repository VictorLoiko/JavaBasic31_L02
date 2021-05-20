package by.epam.unit02.main;

public class Task09 {
    public static void main(String[] args){
        int x;
        double fx;

        x=4;

        fx = Double.NaN;

        if (x<=-3){
            fx=9;
        }else if (x>3){
            fx = 1/(Math.pow(x,2)+1);
        } else {
            System.out.println("В данной точке значение функции не определено");
        }

        if (!Double.isNaN(fx)){
            System.out.printf("Значение функции в точке x=%d: F(x)=%f",x,fx);
        }
    }
}// Молодец
