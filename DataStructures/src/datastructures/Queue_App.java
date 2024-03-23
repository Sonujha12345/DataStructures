package datastructures;

import java.util.Scanner;

class Queue{
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	private Scanner sc=new Scanner(System.in);
	
	public Queue(int n) {
		q=new int[n];
		size=q.length;
	}
	
	public void insert() {
		int ele;
		if(r==size-1) {
			System.out.println("Insert Not Possible");
		}
		else {
			System.out.println("Enter an element");
			ele=sc.nextInt();
			++r;
			q[r]=ele;
		}
	}
	
	public void delete() {
		if(r==-1||f>r) {
			System.out.println("Delete Not Possible");
		}
		else {
			System.out.println("Element Delete is "+q[f]);
			++f;
		}
	}
	
	public void display() {
		if(r==-1||f>r) {
			System.out.println("Display Not Possible");
		}
		else {
			for(int i=f; i<=r;i++) {
				System.out.println(q[i]+" ");
			}
			System.out.println("");
		}
	}
}

public class Queue_App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Queue Size");
	int n=sc.nextInt();
	Queue q=new Queue(n);
	while(true) {
		System.out.println("Press 1 For Insert");
		System.out.println("Press 2 For Delete");
		System.out.println("Press 3 For Display");
		System.out.println("Press Any Other Number To Exit");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:q.insert();
		break;
		case 2: q.delete();
		break;
		case 3: q.display();
		break;
		default :System.exit(0);
		sc.close();
		}
		
	}
}
}
