package datastructures;

import java.util.Scanner;

class Stack{
	private int s[];
	private int size;
	private int top=-1;
	private Scanner sc =new Scanner (System.in);
	
	public Stack(int n) {
		s=new int[n];
		size=s.length;
	}

	public void push() {
		int ele;
		if(top==size-1) {
			System.out.println("Push Not Possible");
		}
		else {
			System.out.println("Enter The Element: ");
			ele=sc.nextInt();
			++top;
			s[top]=ele;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Pop Not Possible");
		}
		else {
			System.out.println("Element Delete is "+s[top]);
			--top;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Display Not Possible");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
			System.out.println();
		}
	}
}

public class Stack_App {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter The Stack Length: ");
	int n=sc.nextInt();
	Stack s=new Stack(n);
	while(true) {
		System.out.println("Press-------> 1 For Push");
		System.out.println("Press-------> 2 For Pop");
		System.out.println("Press-------> 3 For Displying");
		System.out.println("Press Any Number To Exit");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:s.push();
		break;
		case 2: s.pop();
		break;
		case 3: s.display();
		break;
		default: System.exit(ch);
		sc.close();
		
	}
}
}
}
