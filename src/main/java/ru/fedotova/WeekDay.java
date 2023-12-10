package ru.fedotova;

public class WeekDay {
    public enum weekDay{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    public static String weekDay(weekDay name){
        String nameRus = null;
        switch (name){
            case MONDAY: nameRus = "Понедельник";
                break;
            case TUESDAY: nameRus = "Вторник";
                break;
            case WEDNESDAY: nameRus = "Среда";
                break;
            case THURSDAY: nameRus = "Четверг";
                break;
            case FRIDAY: nameRus = "Пятница";
                break;
            case SATURDAY: nameRus = "Суббота";
                break;
            case SUNDAY: nameRus = "Воскресение";
                break;
        }
        return nameRus;
    }
}
