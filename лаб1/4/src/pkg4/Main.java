package pkg4;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        String str;
        int j = 0;
        Scanner sc1 = new Scanner(System. in );
        str = sc1.nextLine();
        char[] chmas = str.toCharArray();
        System.out.println("Исходная строка: "+str);
        for(int i = 0; i < chmas.length; i++)
        {
            if(chmas[i] == ' ')
            {
                j = 0;
            }
            else
            {
                if(j == 2)
                {
                    chmas[i] = '6';
                }
                j++;
            }
            
            /*System.out.println(j);
            System.out.println("i " + i);*/
        }
        str = new String(chmas);
        System.out.println("новая строка: "+str);
    }
}