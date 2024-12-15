package ru.ezhidkova.util;
import ru.ezhidkova.exception.*;

public enum FindDayName {
    MONDAY ("Monday", "понедельник"),
    TUESDAY ("Tuesday","вторник"),
    WEDNESDAY ("Wednesday", "среда"),
    THURSDAY ("Thursday", "четверг"),
    FRIDAY ("Friday", "пятница"),
    SATURDAY ("Saturday", "суббота"),
    SUNDAY ("Sunday","воскресенье");

    private final String englishDay;
    private final String russianDay;

    FindDayName(String englishDay, String russianDay) {
        this.englishDay = englishDay;
        this.russianDay = russianDay;
    }

    public String getEnglishDay(){
        return englishDay;
    }

    public String getRussianDay(){
        return russianDay;
    }

    public static FindDayName showEnglishDayName(String englishDay) throws DayNameDoesntExist {
        for (FindDayName day : values()) {
            if (day.getEnglishDay().equalsIgnoreCase(englishDay)) {
                return day;
            }
        }
        throw new DayNameDoesntExist("Такого дня недели не существует.");
    }
}
