/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author aytaj.veyisli
 */
public class Math {
    
    
    public static void find(int n){
        for (int i = 1; i < n; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    
    
    
    
    public static void digitSum(int num){
        int sum = 0;
        int result = 0;
        while(num>0){
            result=num%10;
            sum+=result;
            num/=10;
        }
        System.out.println(sum);
    }
    
    
    
    public static void factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
    
        }
        System.out.println(result);
    }
    
    
    
    public static int findReverse(int num){
        int res = 0;
        while(num>0){
            res*=10;
            res+=num%10;
            num=num/10;
            
        }
        return res;
    }
    
    
    public static boolean polindrom(int num){
        return num==Math.findReverse(num);
    }
            
    
    
    
}
