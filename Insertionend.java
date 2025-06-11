package Demo;

import java.util.Scanner;

public class Insertionend {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=sc.nextInt();
		int a[]=new int[size];//old array
		int b[]=new int[a.length+1];//new array
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the new element:");
		int element=sc.nextInt();
		b[b.length-1]=element;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
	}

}
