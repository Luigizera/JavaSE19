package github.lugom.TryCatch.Ex1.entities;

import github.lugom.TryCatch.Ex1.exceptions.WithdrawException;

public class Account
{
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double withdrawLimit) {
            this.number = number;
            this.holder = holder;
            this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double balance) {
        this.balance += balance;
    }

    public void withdraw(Double balance) {
        if(balance <= withdrawLimit) {
            this.balance -= balance;
        }
        else {
            throw new WithdrawException("The amount exceeds withdraw limit");
        }

    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
