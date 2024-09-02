/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

import java.util.Scanner;

/**
 *
 * @author zelen
 */
public class Target5 {
    
    public static void main (String[] args){
        //pegar String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um string: ");
        String str = scanner.nextLine();

        //reverter String
        
        //get str len
        int length = str.length();  
        
        //criar arr tam str
        char[] reversedArray = new char[length];
        
         //put in arr reversed
         for (int i = 0; i < length; i++) {
                reversedArray[i] = str.charAt(length - 1 - i);
            } 
         
        //converter de volta para String
        String reversedStr = new String(reversedArray);
        
        
        
        //imprimir String
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + reversedStr);
        
    }
    
}
