package pkg5;

import java.io.PrintStream;
import java.util.Scanner;

public class Main 
{
    private static final String TEXT =
            "В тексте каждую букву заменить ее порядковым номером в алфавите.\n" +
            "При выводе в одной строке печатать текст с двумя пробелами между буквами,\n" +
            "в следующей строке внизу под каждой буквой печатать ее номер.";
    
    
    public static void main(String[] args) 
    {
        System.out.println(TEXT);
        String s;
        Scanner sc1 = new Scanner(System.in);
        s = sc1.nextLine();
        System.out.println("Исходная строка: " + s);
        char[] charArray = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++)
        {
            System.out.print(charArray[i] + "\t");
        }
        
        System.out.println("");
        
        for (int i = 0; i < s.length(); i++)
        {
            System.out.print((int)charArray[i] + "\t");
        }
    }
}