public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2013;

        if (clientOS == 1 && clientDeviceYear >= 2015)
        {System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 1 && clientDeviceYear < 2015)
        {System.out.println("Установите облегчённую версию приложения для Android по ссылке");}
        else if  (clientOS != 1 && clientDeviceYear >= 2015) {System.out.println("Установите версию приложения для IOS по ссылке");}
        else {System.out.println("Установите облегчённую версию приложения для IOS по ссылке");}
    }
}