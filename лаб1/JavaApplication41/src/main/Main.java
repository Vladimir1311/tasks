package main;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        String[] str;
        int n = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество вводимых строк: ");
        n = sc1.nextInt();
        str = new String[n];
        //ввод строк
        Scanner sc2 = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            System. out.println( " Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
        String s = str[0];
        //поиск наименьшей строки
        for(int i = 0; i < n; i++)
        {
            if(s.length() > str[i].length())
            {
                s = str[i];
            }
        }
        System.out.print("Наименьшая строка: " + s + "\nЕе длина: " + s.length());
    }  
}