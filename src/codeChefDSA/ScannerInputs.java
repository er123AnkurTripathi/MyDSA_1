package codeChefDSA;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner read = new Scanner(System.in);
		//Taking int as input
        //int a = read.nextInt();
        //System.out.println("Input Received:"+a);
        
        //Taking space separated String
		/*
		 * String A = read.next(); String B = read.next(); String C = read.next();
		 * String D = read.next(); String E = read.next(); System.out.print(A + " " + B
		 * + " " + C + " " + D + " " + E );
		 */
        
        
        // Take n inputs
        int n =read.nextInt();
        int[] array= new int[n];
        
        for(int i=0; i<n;i++)
        {
        	array[i]=read.nextInt();
        }
        System.out.println(array[0]+""+array[n-1]);
        
	}

}
