package com.Oops.Practice;

public class Pattern {
	public static void main(String[] args) {
		int n = 2;
		int nt = 1;
		int ns = n+1;
		for(int i=0; i<n; i++) {
			// printing space
			for (int j=1; j<=ns; j++)System.out.print("  ");
			
			// startprinting
			for(int j=0; j<nt; j++) System.out.print("* ");
			
			// next line
			System.out.println("");
			ns--;
			nt+=2;
		}
		for(int i=0; i<3; i++) {
			// printing star;
			for(int j=0; j<7; j++) {
				if(i==1 && j>0 && j<6) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
}
