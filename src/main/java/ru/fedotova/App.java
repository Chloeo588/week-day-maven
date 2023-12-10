package ru.fedotova;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Введите день недели на английском" );
        Scanner scanner = new Scanner(System.in);
        String dayWeek = scanner.nextLine();
        dayWeek = dayWeek.toUpperCase();
        System.out.println(WeekDay.weekDay(WeekDay.weekDay.valueOf(dayWeek)));
    }
}
