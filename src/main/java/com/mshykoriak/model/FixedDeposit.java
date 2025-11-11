package com.mshykoriak.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

/**
 * Fixed Deposit / Time Deposit (a.k.a. Term Deposit, Certificate of Deposit)
 * Money is locked for a fixed period (e.g., 6 months, 1 year).
 * Higher interest rates than savings accounts.
 * Early withdrawal may incur penalties.
 * Example use: saving for a future purchase with guaranteed interest.
 */
@Entity
@PrimaryKeyJoinColumn(name = "fixed_acc_id")
public class FixedDeposit extends Account{

    private Date lockedFrom;
    private Date lockedUntil;
    private float interestRate;
    private InterestType interestType;

    private FixedDeposit(Builder builder) {
        super(builder);
        this.lockedUntil = builder.lockedUntil;
        this.interestRate = builder.interestRate;
        this.lockedFrom = builder.lockedFrom;
        this.interestType = builder.interestType;
    }

    protected FixedDeposit() {}



    public static class Builder extends Account.Builder<Builder> {

        private Date lockedFrom;
        private Date lockedUntil;
        private float interestRate;
        private InterestType interestType;

        public Builder interestType(InterestType interestType) {
            this.interestType = interestType;
            return this;
        }
        public Builder lockedFrom(Date lockedFrom) {
            this.lockedFrom = lockedFrom;
            return this;
        }

        public Builder lockedUntil(Date lockedUntil) {
            this.lockedUntil = lockedUntil;
            return this;
        }

        public Builder interestRate(float interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        @Override
        public Account build() {
            return new FixedDeposit(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
