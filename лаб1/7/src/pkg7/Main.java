package pkg7;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * 7.Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 *
 */

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int chislo = 0;
        System.out.println("Введите текст: ");
        s = sc.nextLine();
        System.out.println("Введите число, которое будет означать"
                + " длину слова, которое нужно удалить :");
        try
        {
            chislo = sc.nextInt();
        }
        catch (InputMismatchException fg)
        {
            System.out.print("Не число" );
            return;
        }
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strArr.length;i++){

            char first = strArr[i].charAt(0);

            if((strArr[i].length()!=chislo) && (first != 'a') 
                    && (first != 'e') && (first != 'i') && 
                    (first != 'o') && (first != 'u') && (first != 'y'))
            {
                sb.append(strArr[i]+" ");
            }

        }
        String output = sb.toString().trim();
        System.out.print(output);
    }
}