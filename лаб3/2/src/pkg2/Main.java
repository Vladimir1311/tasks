package pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * 2. Ввести число, занести его цифры в	стек. 
 * Вывести в число, у которого цифры идут в обратном порядке.
 */

public class Main 
{
    static int CHISLO;
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число: ");
        CHISLO = sc.nextInt();
        Stack<Integer> integer = new Stack<Integer>();
        
        //int i = 0;
        //int[] arrInt = new int[6];
        List<Integer> arrInt = new ArrayList<Integer>();
                
        //число разбиение на массив
        while(CHISLO != 0)
        {
            arrInt.add(CHISLO % 10);
            CHISLO /= 10;
        }
        
        //помещение числа в стэк
        for(int j = arrInt.size() - 1; j >= 0; j--)
        {
            integer.push(arrInt.get(j));
        }
        
        // вывод строк из стека
        while (!integer.empty()) 
        {
            System.out.print(integer.pop() + " ");
        }
    }
}