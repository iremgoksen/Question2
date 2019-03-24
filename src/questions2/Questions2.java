/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions2;

/**
 *
 * @author Kullanıcı
 */
public class Questions2 {
  
    
    public int recursive(int n) {
       if(n>1) {                                   //  loop stop criterion //  if n is big than one
            int result=recursive(n-1)*3-(n-1);     //  n>0, Xn=(Xn-1)*3-(n-1)    2 4 9 23 64 .. array serias
            System.out.println(result);            
            return result;
        } else {                                   //  if n isn't big than one,  send one to main
            return 1;
        }
    }
   
}