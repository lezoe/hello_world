/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poeq4;

import java.util.Scanner;

/**
 *
 * @author Lerato.Mashapo
 */
public class PoeQ4 
{
static int num,sum,count,digit,temp;

   
    public static void main(String[] args)
    {
 //getting the number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = scanner.nextInt();
        scanner.close();
         //making a copy of the input number
        temp = num;//user prompted value
        method();
        
    }
    public static void method()
    {
        
        
        //counting digits in the input number
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Digit at place "+count+" is: "+digit);
            
            temp = temp / 10;
            
            count--;
         sum+=digit;
        }
        
        System.out.println("the sum is: " +sum);
        
    }
        
        
       
        
       
        
        
        }
    
    

