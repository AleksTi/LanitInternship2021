package ru.yandex.sashanc.lanit.animals.description;

import org.apache.log4j.Logger;

public class WrongFoodException extends Exception{
    protected static final Logger logger = Logger.getLogger(WrongFoodException.class);

    public WrongFoodException() {
        logger.info("I don't eat Grass Exception is occurred");
    }

    public WrongFoodException(String message) {
        super(message);
        logger.info("I don't eat Grass Exception is occurred");
    }

    public WrongFoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFoodException(Throwable cause) {
        super(cause);
    }
//
//    public WrongFoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}
