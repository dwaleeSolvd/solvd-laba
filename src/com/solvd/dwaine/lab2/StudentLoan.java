package com.solvd.dwaine.lab2;

// Abstract class
abstract class StudentLoan {
    final static int studentLoanAmount = 10000;

    abstract void useLoan();
    public class NegativeValueException extends Exception{

        public  NegativeValueException() {
            super("Value cannot be negative.");
        }
    }
}