package com.Team2Java12.MechAppoint.Exception;

public class ConflictException extends RuntimeException {

    private static final long serialVersionUID = -1L;
    public ConflictException (String message) {
        super(message);
    }

}