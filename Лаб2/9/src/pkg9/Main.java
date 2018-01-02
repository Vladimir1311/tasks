package pkg9;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 9. Проверить, надежно ли составлен пароль. Пароль считается надежным, 
 * если он состоит из 8 или более символов. Где символом может 
 * быть английская буква, цифра и знак подчеркивания. Пароль должен 
 * содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру. 
 * – пример правильных выражений: C00l_Pass, SupperPas1. 
 * – пример неправильных выражений: Cool_pass, C00l.
 */

public class Main
{
    static String Password;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Пароль: ");
        Password = sc.nextLine();
        
        Pattern p1 = Pattern.compile("(?=^.{8,}$)"
                + "(?=.+\\d)"
                + "(?=.+[A-Z])"
                + "(?=.+[a-z]).*$");
        
        System.out.println(Password + ": " + p1.matcher(Password).matches());
    }
}