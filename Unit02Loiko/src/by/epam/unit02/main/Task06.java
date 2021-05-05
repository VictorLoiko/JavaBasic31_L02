package by.epam.unit02.main;

public class Task06 {
    public static void main(String[] args){
        int M,N;
        double result;

        M=215323;
        N=412;

        result = (double)M/N;

        System.out.println("Результат деления: "+ result);
        System.out.printf("Младшая цифра целой части: %d\n",(int)(result%10));
        System.out.printf("Старшая цифра дробной части: %d",(int)((result*10)%10));
    }
}
