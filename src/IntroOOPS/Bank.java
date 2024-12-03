package IntroOOPS;

public class Bank {
    String accountNumer;
    int balance;
    double roi;

    double getSimpleInterest(int years){
        return years * ( roi / 100) * balance;
    }

    double getBalanceWithInterest(int years){
        return getSimpleInterest(years) + balance;
    }
}