package com.neoteric.atmservice;

public class Invalidotpexception extends Exception{

    public Invalidotpexception(String message) {
        super(message);
    }

    public Invalidotpexception(String message, Throwable cause) {
        super(message, cause);
    }

    public Invalidotpexception(Throwable cause) {
        super(cause);
    }
}
