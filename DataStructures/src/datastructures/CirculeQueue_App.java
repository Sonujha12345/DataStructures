package datastructures;

import java.util.Scanner;


class CirculeQueue{
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner sc=new Scanner(System.in);
	
	public CirculeQueue(int n) {
		cq=new int [n];
		size=cq.length;
	}
	
	public void insert() {
		if(count==size) {
			System.out.println("Insert Not Possible");
		}
		else {
			System.out.println("Enter an Element ");
			int ele=sc.nextInt();
			r=(r+1)%size;
			cq[r]=ele;
			++count;
		}
	}
	
	public void delete() {
		if(count==0) {
			System.out.println("Delete Not Possible");
		}
		else {
			System.out.println("Element Delete is  "+cq[f]);
			f=(f+1)%size;
			--count;
		}
	}
	
	public void display() {
		int f1=f;
		if(count ==0) {
			System.out.println("Display Not Possible");
		}
		else {
			for(int i=1;i<=count;i++) {
				System.out.print(cq[f1]+" ");
				f1=(f1+1)%size;
			}
			System.out.println("");
		}
	}
}

public class CirculeQueue_App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CirculeQueue Size");
	int n=sc.nextInt();
	CirculeQueue cq=new CirculeQueue(n);
	while(true) {
		System.out.println("Press 1 For Insert");
		System.out.println("Press 2 For Delete");
		System.out.println("Press 3 For Display");
		System.out.println("Press Any Other Number To Exit");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:cq.insert();
		break;
		case 2: cq.delete();
		break;
		case 3:cq.display();
		break;
		default:System.exit(0);
		sc.close();
		}
		
	}
}
}
