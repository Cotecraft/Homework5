public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-2");

        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 || clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 0 || clientDeviceYear == 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1 || clientDeviceYear > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");

        int year = 2021;
        switch (year) {
            case 4:
                System.out.println("Год високосный");
                break;
            case 400:
                System.out.println("Этот год високосный");
                break;
            case 100:
                System.out.println("Год не високосный");
                break;
            default:
                System.out.println("Этот год не високосный");
        }

        System.out.println("Задание 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка будет в течение суток");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет в течение 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка будет в течение 3 суток");
        }else{
            System.out.println("Доставки нет");
        }

        System.out.println("Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Начало года, зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Конец года, зима");
                break;
            default:
                System.out.println("Такого периода не существует");
        }

    }
}