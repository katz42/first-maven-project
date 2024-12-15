package ru.ezhidkova;

import ru.ezhidkova.exception.DayNameDoesntExist;
import ru.ezhidkova.util.FindDayName;

import java.util.Scanner;

public class App 
{
    public static void main (String[] args ){
        System.out.println("Введите название дня недели на английском:");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        try {
            FindDayName showDayOfWeek = FindDayName.showEnglishDayName(day);
            System.out.println(showDayOfWeek.getEnglishDay() + " - это " + showDayOfWeek.getRussianDay() + ".");
        } catch (DayNameDoesntExist e) {
            System.out.println("Такого дня недели не существует");
        }
    }
}
