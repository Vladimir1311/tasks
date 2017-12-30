package pkg1;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 
 * 1.Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
 * – пример правильных выражений: abcdefghijklmnopqrstuv18340.
 * – пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.
 *
 */

public class Main 
{
    static String S;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine(); //ввод строки
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$"); //регулярное выражение
        
        System.out.println(S + ": " + p1.matcher(S).matches()); // true или false
    } 
}
