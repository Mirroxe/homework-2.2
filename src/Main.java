public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных и параметров программы
        int initialBalance = 200; // начальный баланс клиента
        int topUpAmount = 1500; // сумма пополнения

        // Рассчитываем количество бонусных рублей и новый баланс клиента
        int bonus = 0; // количество бонусных рублей
        if (topUpAmount > 1000) { // если сумма пополнения больше 1000
            bonus = topUpAmount / 100; // рассчитываем количество бонусных рублей
        }
        int newBalance = initialBalance + topUpAmount + bonus; // новый баланс клиента

        // Выводим результаты на экран
        System.out.println("Итоговый баланс: " + newBalance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonus + " руб.");
    }
}