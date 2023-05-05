package com.solvd.dwaine.lab2;

import java.util.logging.Logger;

public abstract class Person {

    //private Logger logger = parentLogger;
    protected String firstName;
    protected String lastName;
    protected  String address;

    public String getAddress() {
        return address;
    }


    public static final String getFavouriteQuote() {
        String[] quotes = new String[]{
                "A barking dog never bites.",
                "Absence makes the heart grow fonder.",
                "All that glitters isn’t gold. An ounce of prevention is worth a pound of cure",
                " Children should be seen and not heard.",
                "Doubt is the beginning, not the end, of wisdom.",
        };
        return quotes[(int) Math.floor(Math.random() * quotes.length)];
    }

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    Person() {

    }

    void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s %s %s", this.getClass().toString(), firstName, lastName, address);
    }

    // The name of this Logger will be "org.apache.logging.Parent"
    //protected static final Logger parentLogger = LogManager.getLogger();



   /* protected Logger getLogger() {
        return logger;
    }

    protected void setLogger(Logger logger) {
        this.logger = logger;
    }


    public void log(Marker marker) {
        logger.debug(marker,"Parent log message");
    }
}*/

    // check list abstract method
    abstract double salaryExpectation();

}