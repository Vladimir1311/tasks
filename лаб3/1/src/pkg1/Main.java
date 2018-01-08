package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/*
 * 1. Ввести строки из файла, записать их в стек. 
 * Вывести строки в файл в обратном порядке.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        File file = new File("C://Users//gd//Desktop//"
                + "Изучение Java//Интеренет//лаб3//file.txt");
        try 
        {
            Scanner sc = new Scanner(file);
            Stack<String> strings = new Stack<String>();
            
            // считывание строк в стек
            while (sc.hasNextLine())
            {
                strings.push(sc.nextLine());
            }

            // вывод строк из стека
            while (!strings.empty()) 
            {
                System.out.println(strings.pop());
            }
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}