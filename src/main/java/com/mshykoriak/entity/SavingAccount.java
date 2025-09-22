package com.mshykoriak.entity;

import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 * Savings Account
 * Designed for storing money safely.
 * Pays interest (higher than checking).
 * May limit number of withdrawals per month.
 * Example use: emergency fund, short-term savings.
 */
@PrimaryKeyJoinColumn(name = "savings_acc_id")
public class SavingAccount extends Account{

    private int limitWithdrawals;
    private float interestRate;

    protected SavingAccount(){}
    private SavingAccount(Builder builder) {
        super(builder);
        this.limitWithdrawals = builder.limitWithdrawals;
        this.interestRate = builder.interestRate;
    }

    public static class Builder extends Account.Builder<Builder> {

        private int limitWithdrawals;
        private float interestRate;

        public Builder limitWithdrawals(int limitWithdrawals) {
            this.limitWithdrawals = limitWithdrawals;
            return this;
        }

        public Builder interestRate(int interestRate) {
            this.interestRate = interestRate;
            return this;
        }
        @Override
        public Account build() {
            return new SavingAccount(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
