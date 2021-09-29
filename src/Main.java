public class Main {
    public static void main(String[] args) {
        int initialBalance = 200 ;
        int amount = 1000 ;
        int bonusPrise = 100 ;
        int bonus;
        if (amount <= 1000) { bonus = 0 ;
        }
        else { bonus = amount / bonusPrise;
        }
        int finalBalance = initialBalance + amount + bonus ;


        System.out.println("Бонусы" + bonus);
        System.out.println("Итоговый баланс" + finalBalance);
    }
}
