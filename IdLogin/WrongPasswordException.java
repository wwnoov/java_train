package com.myStudy.train.train1016.ex01;

public class WrongPasswordException extends Exception {
    public WrongPasswordException () {}
    public WrongPasswordException (String message) {
        super(message);
    }
}
