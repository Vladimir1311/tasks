package pkg3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * 3. Сложить два многочлена заданной степени, 
 * если коэффициенты многочленов хранятся в объекте HashMap.
 */

public class Main 
{
    static int STEPEN;
    
    public static void main(String[] args)
    {
        Random random = new Random(36);
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите степень многочленов: ");
        STEPEN = sc.nextInt();
        
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        hashMap.put(0, random.nextInt(10));
        hashMap.put(1, random.nextInt(10));
        
        double result = Math.pow(hashMap.get(0), STEPEN) 
                + Math.pow(hashMap.get(1), STEPEN);
        System.out.println(result);
    }
}
