package pkg6;

import java.util.Scanner;

/*
 * 
 * 6.Из небольшого текста удалить все символы, кроме пробелов,
 * не являющиеся буквами. Между последовательностями подряд 
 * идущих букв оставить хотя бы один пробел.
 *
 */

public class Main 
{
    public static void main(String[] args) 
    {
        String s;
        String newtext="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строчку: ");
        s = sc.nextLine();
        System.out.println("\nИсходная строка: " + s);
        //переводим строку в массив
        char[] chr = s.toCharArray();
        for(char ch: chr)
        {
            if(Character.isLetter(ch) || Character.isWhitespace(ch))
                newtext+=ch;
        }
        System.out.println(newtext+"\r\n");
        String[] words=newtext.split("\\s");
        
        
        newtext="";
        for(String st: words)
        {
            //создаем новую строку только из слов, добавляя разделитель пробел
            if(st.trim().length()>0)
                newtext+=st+" ";
        }
        //отрежем последний пробел
        newtext=newtext.trim();
        System.out.print(newtext);
    }
}