/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions2;
import java.util.Scanner;
/**
 *
 * @author Kullanıcı
 */
public class Main {
    
    public static void main(String[] args) {
        Questions2 q2=new Questions2();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");   //  The user is requested to enter a number
        int number=input.nextInt();             //  The entered number was transferred to this variable.
        q2.recursive(number/3+1);               //  sending the number to the function
                
    }

   
    
   
    
}

