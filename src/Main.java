public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
// Задание 2
        System.out.println("Задание 2");
        int yearOld = 2017;
        if (yearOld < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearOld >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (yearOld < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (yearOld >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задание 3
        System.out.println("Задание 3");
        int year = 2021;

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        int addingDay = 1;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней " + deliveryDay);
        }
        if (deliveryDistance>=20 && deliveryDistance<60) {
            System.out.println("Потребуется дней :" + (deliveryDay+addingDay));
        }
        if (deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("Потребуется дней :" + (deliveryDay+(addingDay*2)));
        }
        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;

            default:
                System.out.println("Такого месяца не существует");
        }

    }
}