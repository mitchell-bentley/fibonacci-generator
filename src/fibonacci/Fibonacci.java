/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author mitchell
 */
public class Fibonacci {
    
    public static void main(String[] args) {
       
        int j, addedValue, userValue;
        int compValue1 = 0;
        int compValue2 = 1;
        addedValue = 1;
        //addedValue = compValue1 + compValue2;
        
        Scanner scan = new Scanner(System.in);
        userValue = scan.nextInt();
        
        j = userValue;
        
        for (int i = 0; i < j; i++)
        {
            addedValue = compValue1 + compValue2;  //1+1 = 2
            System.out.println("IN:" + compValue1 + " + " + compValue2);
            System.out.println("OUT:" + addedValue);
            compValue1 = compValue2;
            
            compValue2 = addedValue;
           
            
        }
        
        System.out.println(addedValue);
        }
    }
    

