public class Banking {
    public static void main(String args[]) {
        //tests checking account
        System.out.println("Banking program v0");
        System.out.println("\nTest checking account\naccount created with 1000 balance");
        Account myAccount = new CheckingAccount("harbintchecking",1000);
        myAccount.withdraw(1001);
        System.out.println("Withdraw 1001");
        myAccount.tell();
        myAccount.deposit(5);
        System.out.println("Deposit 5");
        myAccount.tell();
        System.out.println("\nTest savings account\naccount created with 500 balance");
        Account myAccount2 = new SavingsAccount("harbintsavings",500);
        myAccount2.withdraw(200);
        System.out.println("Withdraw 200");
        myAccount2.tell();
        myAccount2.deposit(5);
        System.out.println("Deposit 5");
        myAccount2.tell();
        ((SavingsAccount) myAccount2).applyMonthlyFee();
        System.out.println("Final savings account balance: " + myAccount2.getBalance());
        System.out.println("Attempt to overdraw savings account");
        myAccount2.withdraw(500);
    }
}
