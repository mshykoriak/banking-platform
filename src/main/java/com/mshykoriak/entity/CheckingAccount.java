package com.mshykoriak.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 * Checking / Current Account
 * Designed for frequent transactions: deposits, withdrawals, transfers.
 * Usually offers no or very low interest.
 * Provides debit cards, online banking, and bill payments.
 * Example use: daily spending, salary deposits.
 */
@Entity
@PrimaryKeyJoinColumn(name = "checking_acc_id")
public class CheckingAccount extends Account{

    @Column(nullable = false)
    private int withdrawalsPerMonth;

    private CheckingAccount(Builder builder) {
        super(builder);
        this.withdrawalsPerMonth = builder.withdrawalsPerMonth;
    }

    protected CheckingAccount() {}

    public static class Builder extends Account.Builder<Builder> {
        private int withdrawalsPerMonth;

        public Builder withdrawalsPerMonth(int withdrawalsPerMonth) {
            this.withdrawalsPerMonth = withdrawalsPerMonth;
            return this;
        }

        @Override
        public Account build() {
            return new CheckingAccount(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
