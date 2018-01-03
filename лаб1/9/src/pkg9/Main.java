package pkg9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * 9.Найти и напечатать, сколько раз повторяется в тексте каждое слово.
 *
 */

public class Main 
{
    public static void main(String[] args) 
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String [] words = s.replaceAll("[-.?!)(,:]", "").split("\\s");
        
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words)
        {
            if(!word.isEmpty()) 
            {
                Integer count = counterMap.get(word);
                if(count == null)
                {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
      
        for(String word : counterMap.keySet()) 
        {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}