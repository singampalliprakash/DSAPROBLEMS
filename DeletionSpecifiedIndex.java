package Demo;

import java.util.Scanner;

public class DeletionSpecifiedIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length-1];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		System.out.println("enter the removing index");
		int index=sc.nextInt();
		if(index<0||index>=a.length)
		{
			System.out.println("enter the proper index value");
			return;
		}
		
		for(int i=0;i<b.length;i++)
		{
			
			if(i<index)
			{
				b[i]=a[i];
			}
			
			else
			{
				b[i]=a[i+1];
				//b[i-1]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		 
	}

}
