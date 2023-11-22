package com.Kodnest.Patterns.Level5;
public class Pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
            // Print spaces
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int k = 1; k <= 2 * i - 1; k++) {
                if(i==1 || i==3)
                	System.out.print("*");
                else {
                	if(k==2)
                		System.out.print(" ");
                	else
                		System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}
