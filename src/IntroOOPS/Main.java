package IntroOOPS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        Bank bank = new Bank();
        bank.balance = 95000;
        bank.roi = 6.5;
        System.out.println("Intrest = " + bank.getSimpleInterest(2));
        System.out.println("Intrest + Balance = " + bank.getBalanceWithInterest(2));
    }
}