package org.example.accounts;

public class CheckingAccount extends Account {

    @Override
    public void setAccountBalance(long accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            return;
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((this.accountBalance - amount) < 0) {
            return false;
        } else {
            accountBalance -= amount;
            return true;
        }
    }

}
