package pkg8;

import java.util.Scanner;

/*
 * 
 * 8.В тексте найти все пары слов, из которых одно является об­ращением другого.
 *
 */
 
public class Main 
{
    static String  S;
    static int num;
    static String [] SS;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        SS = S.split("\\s"); // разделение пробелом
        
        for(int i=0;i<SS.length;i++) 
        {
            for(int j =i+1;j<SS.length;j++) 
            {
                if(solve(SS[i], SS[j])) 
                {
                    System.out.println(SS[i] + " " +SS[j]);
                    num++;
                }
            }
        }
        
        if(num==0) 
        {
            System.out.println("Таких слов не найдено");
        }
    }
    
    
    static boolean solve(String S, String S1)
    {
        StringBuilder SS = new StringBuilder(S);
        SS=SS.reverse();
        return S1.equals(SS.toString());
    }
}