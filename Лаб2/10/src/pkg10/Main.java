package pkg10;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 10. Проверить является ли заданная строка шестизначным числом, 
 * записанным в десятичной системе счисления без нулей в старших разрядах. 
 * – пример правильных выражений: 123456, 234567. 
 * – пример неправильных выражений: 1234567, 12345.
 */

public class Main 
{
    static String CHISLO;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        CHISLO = sc.nextLine();
        
        Pattern p1 = Pattern.compile("[1-9][0-9]{5}");
        
        System.out.println(CHISLO + ": " + p1.matcher(CHISLO).matches());
    }
}