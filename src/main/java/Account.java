public class Account {
    protected double mBalance;
    private String mOwner;
    protected double mTotalFee = 0;
    protected double mTotalDeposits = 0;
    protected double mTotalWithdrawls = 0;


    public Account(String owner,double balance) {
        mOwner = owner;
        mBalance = balance;
    }

    public double getBalance() {return mBalance;}
    public double getTotalDeposits() {return mTotalDeposits;}
    public double getmTotalWithdrawls() {return mTotalWithdrawls;}
    public double getTotalFee() {return mTotalFee;}
    public String getOwner() {return mOwner;}

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("negative values not allowed");
        }
        else {
            mBalance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount <= 0) {
            System.out.println("negative values not allowed");
        }
        else {
            mBalance-= amount;
        }
    }
    public void tell() {
        System.out.println(mOwner + " has " + this.getBalance() + " in the bank. Total fee! " +  mTotalFee);
        System.out.println("Total Deposits!" + mTotalDeposits);
        System.out.println("Total Withdrawls!" + mTotalWithdrawls);
    }
}
//Account myAccount = new CheckingAccount("harbint", 100)