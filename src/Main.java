public class Main {
    public static void main(String[] args) {

        int initialData = 50; // Сумма на счету у клиента
        int bonusScale = 100; // Бонусная шкала - 1 бонус за каждые полные 100 рублей пополения
        int deposit = 1700; // Сумма пополнения
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / bonusScale;
        }
        else {
            bonus = 0;
        }

        int totalAccount = initialData + deposit + bonus;

        System.out.println("Пополнили счёт на " + deposit + " руб.");
        System.out.println("Бонус равен " + bonus + " руб.");
        System.out.println("Итоговая сумма " + totalAccount + " руб.");
    }
}