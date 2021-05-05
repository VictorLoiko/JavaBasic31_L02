package by.epam.unit02.main;

public class Task03 {
    public static void main(String[] args){
        int T = 0;
        int hour, min, sec;
        int saveNumberOfSeconds;
        T = 87902;
        saveNumberOfSeconds = T;
        if (T < 0) {
            System.out.println("Неверное значение.");
            return;
        }
        hour = T / 3600;
        T = T - hour * 3600;
        min = T / 60;
        T = T - min * 60;
        sec = T;

        System.out.println("Значение в секундах: " + saveNumberOfSeconds);
        System.out.printf("%02dч %02dмин %02dс",hour,min,sec);
    }
}
