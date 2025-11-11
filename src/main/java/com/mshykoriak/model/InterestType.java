package com.mshykoriak.model;

/**
 * Accrual of interest can be of two types:
 * At the end of the term (simple interest) → interest is calculated on the initial amount (the principal),
 * and at the end of the term the client receives principal + interest.
 * Example: 100,000 ₽ for 1 year at 10% = 110,000 ₽ after one year.
 * With compounding (compound interest) → interest is periodically (e.g., monthly/quarterly) added to the deposit amount,
 * and further interest is accrued on this increased amount.
 * Example: 100,000 ₽ for 1 year at 10% with monthly compounding = about 110,471 ₽ (slightly more than without compounding).
 */
public enum InterestType {
    SIMPLE_INTEREST, COMPOUND_INTEREST;
}
