package Demo;

import java.util.Scanner;

public class InsertionBeg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=sc.nextInt();
		int a[]=new int[size];//old array
		int b[]=new int[a.length+1];//new array
		
		System.out.println("enter the elements in an array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the new element:");
		int element=sc.nextInt();
		b[0]=element;
		for(int i=0;i<a.length;i++) {
			b[i+1]=a[i];//b[1]=a[0],[b2]=a[1];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
