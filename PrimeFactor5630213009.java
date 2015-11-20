/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactor5630213009;

import java.util.Scanner;


public class PrimeFactor5630213009 {
    
    public void  Factorization(int number){
        int x [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
            47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 
            109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
            179, 181, 191, 193, 197, 199, 221, 223, 227, 229, 233, 239,
            241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 
            313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 
            389, 397, 401, 403, 409, 419, 421, 431, 433, 439, 443, 449, 
            457, 461, 463, 467, 479, 481, 487, 491, 499, 503, 509, 521, 
            523, 533, 541, 547, 559, 563, 569, 571, 577, 587, 593, 599, 
            601, 607, 611, 613, 617, 619, 631, 641, 643, 647, 653, 659, 
            661, 673,  677, 683, 689, 691, 701, 709, 719, 727, 733, 739, 
            743, 751, 767, 769, 773, 787, 793, 797, 809, 811, 821, 
            823, 827, 829, 839, 853, 857, 859,863, 871, 877, 881, 883, 887,
            907, 911, 919, 923, 929, 937, 941, 947, 949, 953, 967, 971, 
            977, 983, 991, 997};
        
        while(number!=1 ){
            if(number != 0){
                for(int i =0 ; i<= 1000;i=i+1){
                    if(number %x[i] ==0){
                    number = number/x[i];
                    System.out.print(x[i]);
                    if(number !=1){
                        System.out.print(" x ");
                        i = -1;
                        }
                    if(number ==1){
                        System.out.println("");
                        break;
                        }
                    }
                }
            }else{
                break;
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =1;
        while(number !=0){
            System.out.println("Enter Number 0 Program Exit");
            System.out.print("Enter Number :");
            number = sc.nextInt();
            PrimeFactor5630213009 f = new  PrimeFactor5630213009();
            f.Factorization(number);
           
        }
    }
    
}
