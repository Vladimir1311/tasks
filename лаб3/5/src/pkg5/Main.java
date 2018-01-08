package pkg5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 5. Не используя вспомогательных объектов, переставить отрицательные 
 * элементы данного списка в конец, а положительные - в начало этого списка.
 */

public class Main 
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int i = 0;
        try 
        {
            for (i = 0; i < line.length; ++i)
                list.add(Integer.parseInt(line[i]));
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Неверный формат данных: " + line[i]); 
            return;
        }
        System.out.println("Исходный массив: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Результат: " + list);
    }
}