package datastructures;

import java.util.Scanner;

class Array{
	private int arr [];
	Scanner sc=new Scanner(System.in);
	
	public Array(int n){
		arr=new int[n];
	}
	
	public void insert() {
		System.out.println("Enter The Position From 0 to "+(arr.length-1));
		int pos=sc.nextInt();
		System.out.println("Enter The Element: ");
		int ele=sc.nextInt();
		arr[pos]=ele;
	}
	
	public void delete() {
		System.out.println("Enter The Position To Delete The Element");
		int pos=sc.nextInt();
		System.out.println("Element Delete Is "+arr[pos]);
		arr[pos]=0;
	}
	
	public void display() {
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}

public class Array_App {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter The Array Length");
	int n=sc.nextInt();
	Array a=new Array(n);
	while(true) {
		System.out.println("Press-------> 1 For Inserting");
		System.out.println("Press-------> 2 For Deleting");
		System.out.println("Press-------> 3 For Displying");
		System.out.println("Press any number -------> To Exit");
		int ch=sc.nextInt();
		switch (ch) {
		case 1: a.insert();
		break;
		case 2:a.delete();
		break;
		case 3: a.display();
		break;
		default:System.exit(0);
			
			
		sc.close();		
	}
}
	
}
}
