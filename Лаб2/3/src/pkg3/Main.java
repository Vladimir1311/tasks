package pkg3;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 3. Написать регулярное выражение, определяющее является ли
 * заданная строка правильным MAC-адресом. 
 * – пример правильных выражений: aE:dC:cA:56:76:54. 
 * – пример неправильных выражений: 01:23:45:67:89:Az.
 */

public class Main 
{
    static String S;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Mac-адрес: ");
        S = sc.nextLine();
        
        Pattern p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        
        System.out.println(S + ": " + p1.matcher(S).matches()); // true или false
    }
}