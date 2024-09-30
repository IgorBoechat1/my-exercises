package io.codeforall.bootcamp;

public class Bank {

    public static int money;



    public int getBalance() {
        return money;

    }

    public int withdraw(int amount) {
        if (money >= amount) {
            money = money - amount;
            System.out.println("Balance after withdraw: " + amount);
        } else {
            System.out.println("Your balance is less than " + amount + " Transaction failed...!! ");

        }
        return getBalance();
    }

    public void deposit(int amount) {
        money = money + amount;
        System.out.println("Your balance is " + money);

    }


}





