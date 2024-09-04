/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
import Utility.Math;

/**
 *
 * @author aytaj.veyisli
 */
public class Tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // 1) 0-DAN VERILMIS EDEDE QEDER CUT EDEDLERIN CIXARILMASI
  
  //      System.out.println("Ededi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        
   //     int num = sc.nextInt();
      //  Math.find(num);
        
  // 2) VERILMISH EDEDIN REQEMLERI CEMINI TAPMAQ      
        
   //     System.out.println("Eded daxil edin: ");
        
        Scanner sc1 = new Scanner(System.in);
        
     //   int number = sc1.nextInt();
    //    Math.digitSum(number);
        
        
  // 3) 3CU DEYISEN ISTIFADE ETMEDEN IKI DEYISENIN DEYERINI BIR BIRINE BERABERLESDIRMEK 
  
        int a = 5;
        int b = 3;
        
        a=(a+b)-a;//3
        b=(a+b)-b;//5
        
        
   // 4) FAKTORIAL HESABLAMAQ
        
        Scanner sc2 = new Scanner(System.in);
     //   int fc = sc2.nextInt();
    //    Math.factorial(fc);
        
        
        
        
        
   // 5) VERILMISH EDEDIN TERSI ILE DUZUNUN BERABERLIYININ YOXLANILMASI POLINDROM     
         Scanner sc3 = new Scanner(System.in);
         
         int eded = sc.nextInt();
         
         boolean CheckPolindrome = Math.polindrom(eded);
         System.out.println(CheckPolindrome);
         
        
        
        
    }
    
    
    
    
}
