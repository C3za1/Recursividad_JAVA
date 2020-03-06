/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author cesar
 */
public class Resta 
{
 int a;
 int b;
   public int factorial(int a, int b)
   {
       if(b==0)
       {
           return a;
       }
       return factorial(a,b-1);
      
     }
   
 }
