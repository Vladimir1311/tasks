package pkg2;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Написать регулярное выражение, определяющее является ли данная строка 
 * GUID с или без скобок. Где GUID это строчка, состоящая из 8, 4, 4, 4, 12 
 * шестнадцатеричных цифр разделенных тире. 
 */

public class Main 
{
    static String S;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine(); //ввод строки
        Pattern p1 = Pattern.compile("[a-z\\dA-Z]{8}-[a-z\\dA-Z]{4}-[a-z\\dA-Z]{4}-"
                + "[a-z\\dA-Z]{4}-[a-z\\dA-Z]{12}");
        
        System.out.println(S + ": " + p1.matcher(S).matches()); // true или false
    } 
}