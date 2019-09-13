public class SavingsAccount extends Account {
    public static double MAX_WITHDRAWLS = 3;
    public static double MINIMUM_DEPOSIT = 50;
    public static double SAVINGS_MONTHLY_FEE = 25;
    public SavingsAccount(String owner, double balance) {
        super(owner,balance);
    }

    public void applyMonthlyFee() {
        if(mTotalDeposits <= MINIMUM_DEPOSIT) {
               withdraw(SAVINGS_MONTHLY_FEE);
               System.out.println("Monthly deposit minimum not met. Withdrawing " + SAVINGS_MONTHLY_FEE);
        }
        else {
            System.out.println("Monthly minimum met");
        }
        mTotalDeposits = 0;
    }

    public void deposit(double amount) {
        super.withdraw(amount);
        mTotalDeposits += amount;
    }

    public void withdraw(double amount) {
        mTotalWithdrawls +=1;
        if(this.getBalance() - amount < 0) {
            System.out.println("Cannot overdraw savings account!");
            return;
        }
        if(mTotalWithdrawls>=MAX_WITHDRAWLS) {
            System.out.println("Withdrawl limit reached");
            return;
        }
        super.withdraw(amount);
    }
}
