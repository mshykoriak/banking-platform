package com.mshykoriak.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a superclass for all account types. It is existing primarily for extension
 * @author mshykoriak
 * @since 1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private BigDecimal totalAmount;
    @Column(nullable = false)
    private String currency;
    @Column(nullable = false)
    private User owner;
    @Column(nullable = false)
    private AccountStatus status;
    @OneToMany
    private List<Transaction> transactions = new ArrayList<>();

    protected Account(Builder<?> builder) {
        this.totalAmount = builder.totalAmount;
        this.currency = builder.currency;
        this.owner = builder.owner;
        this.status = builder.status;
    }

    protected Account() {}

    public void updateBalance(BigDecimal delta) {
        totalAmount = totalAmount.add(delta);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public User getOwner() {
        return owner;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    abstract static class Builder<T extends Builder<T>>{
        private BigDecimal totalAmount;
        private String currency;
        private User owner;
        private AccountStatus status;
        private List<Transaction> transactions;

        public Builder(){
        }

        public T totalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
            return self();
        }

        public T currency(String currency) {
            this.currency = currency;
            return self();
        }

        public T owner(User user) {
            this.owner = user;
            return self();
        }

        public T status(AccountStatus status) {
            this.status = status;
            return self();
        }

        public abstract Account build();

        protected abstract T self();
    }
}
