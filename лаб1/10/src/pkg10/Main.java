package pkg10;

import java.util.Scanner;

/*
 * 
 * 10.Найти, каких букв, гласных или согласных, 
 * больше в каждом предложении текста.
 *
 */

public class Main 
{
    static String S;
    static int glas = 0, sogl = 0;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        S = S.toLowerCase();
        S = S.replaceAll("[-.?!)(,:]", "");
        char[] Arrchar;
        Arrchar = S.toCharArray();
        for(int i = 0; i < Arrchar.length; i++)
        {
            if(Arrchar[i] == 'a' || Arrchar[i] == 'e' || Arrchar[i] == 'y' ||
                    Arrchar[i] == 'u' || Arrchar[i] == 'i' || 
                    Arrchar[i] == 'o')
            {
                glas++;
            }
            else
            {
                sogl++;
            }
        }
        
        
        if (sogl > glas)
        {
            System.out.println("Согласных больше");
        }
        else if(glas > sogl)
            System.out.println("Гласных больше");
        else
            System.out.println("Одинаково");
    }
}