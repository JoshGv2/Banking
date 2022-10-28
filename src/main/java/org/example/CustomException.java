package org.example;

public class CustomException extends Exception{

    CustomException(String errorMessage){
        super(errorMessage);
    }
}