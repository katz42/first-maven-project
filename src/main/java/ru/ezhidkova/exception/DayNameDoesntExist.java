package ru.ezhidkova.exception;

public class DayNameDoesntExist extends Exception {
    public DayNameDoesntExist (String dayNameDoesntExistText) {
        super(dayNameDoesntExistText);
    }
}
