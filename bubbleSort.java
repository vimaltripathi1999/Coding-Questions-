package Arrays;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		Bubble_Sort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"   ");
		

	}
  public static void Bubble_Sort(int arr[])
	{
		for(int counter=0;counter<arr.length-1;counter++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
