package pkg6;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 6. Написать регулярное выражение, определяющее является ли данная строчка 
 * датой в формате dd/mm/yyyy. Начиная с 1600 года до 9999 года. 
 * – пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003. 
 * – пример неправильных выражений: 30-04-2003, 1/1/1899.
 */

public class Main 
{
    static String Date;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату: ");
        Date = sc.nextLine();
        
        Pattern p1 = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        
        System.out.println(Date + ": " + p1.matcher(Date).matches());
    }
}
