package com.myStudy.train.train1016.ex01;
public class NoExistIDException extends Exception{
    public NoExistIDException () {}
    public NoExistIDException (String message) {
        super(message);
    }
}