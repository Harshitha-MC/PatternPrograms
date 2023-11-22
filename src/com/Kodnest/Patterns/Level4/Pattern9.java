package com.Kodnest.Patterns.Level4;

public class Pattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=5;k>=1;k--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(" ");
			}
			for(int z=5;z>=1;z--) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
