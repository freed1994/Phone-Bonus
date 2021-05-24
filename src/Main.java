public class Main {
    public static void main(String[] args) {
        int balance = 100; //rub
        int topUpBalance = 1100; //rub
        int bonus = topUpBalance / 100; //rub
        int newBalance;
        if (topUpBalance > 1000) {
            newBalance = balance + topUpBalance + bonus;
        } else {
            newBalance = balance + topUpBalance;
        }
        System.out.println("Ваш баланс:" + newBalance);
    }
}