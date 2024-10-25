/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package codewarsprojects.codewars;

/**
 *
 * @author D_Tanui
 */
public class Codewars {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = reverseNumber(num);
        
        /* Reversing using while loop
        
            while (num != 0){
            int digit = num % 10;

            reversed = reversed*10 + digit;

            num /= 10;

            }

            System.out.println(reversed);
        */
        
        /*Revrsing using the for loop
        
            for (; num != 0; num/=10){
           int digit = num%10;
           
           reversed = reversed*10 + digit;
           
           
            }
            System.out.print(reversed);
        */
        
        System.out.print(reversed);
       
    }
            public static int reverseNumber(int number){
            
            if (number < 10){
                return number;
                
                }else{
                    return
                            Integer.parseInt(new StringBuilder().append(number%10).
                                    append(reverseNumber(number/10)).toString());
                    
                    }
        
            
            
            
        }
}
