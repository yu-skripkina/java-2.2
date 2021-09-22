public class Main {
    public static void main(String[] args) {
        int initialBalance = 200 ;
        int amount = 2222 ;
        int bonusPrise = 100 ;
        int bonus = amount / bonusPrise ;
        int finalBalance = initialBalance + bonus ;
                if (amount <= 1000) {
            bonus = 0 ;
                    }
        System.out.println("Бонусы" + bonus);
        System.out.println("Итоговый баланс" + finalBalance);
    }
}
