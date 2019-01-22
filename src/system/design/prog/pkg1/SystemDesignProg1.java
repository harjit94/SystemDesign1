/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.design.prog.pkg1;

import java.util.Scanner;

/**
 *
 * @author harji
 */
public class SystemDesignProg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc =new  Scanner(System.in);
      System.out.println("enter the name:");
      String name= sc.nextLine();
      System.out.println("you entered"+name);
      char[]nameInChar = new char[name.length()];
      for(int i=0;i<name.length()-1;i++)//populate the array
      nameInChar[i]=name.charAt(i);
      //verify the arraay was populated properly
     // for(int i=0;i<name.length();i++)
        // System.out.println(nameInChar[i]);
        for(int i=nameInChar.length-1;i>=0;i--)
            System.out.println(nameInChar[i]);
      
   
      
    }
    
}
