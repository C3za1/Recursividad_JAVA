/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args)
    {
    int a;
    int b;
    int result;
 
    Resta r=new Resta();
    
    
    Scanner sc=new Scanner (System.in);
      
        System.out.println("1er val");
        a=sc.nextInt();
        
        System.out.println("2do val");
        b=sc.nextInt();
        
        result=r.factorial(a, b);
        System.out.println("La resta es:"+""+result);
    }
    
}
