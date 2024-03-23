package datastructures;

import java.util.Scanner;

class DoubleLinkedList{
	
	class Node{
		int data;
		Node nextlink;
		Node prlink;
	}
	
	private Node first;
	private Scanner sc=new Scanner(System.in);
	
	public void insertfront() {
		System.out.println("Enter an element ");
		int ele=sc.nextInt();
		Node n=new Node();
		n.data=ele;
		n.prlink=null;
		n.nextlink=null;
		if(first==null) {
			first=n;
		}
		else {
			n.nextlink=first;
			first.prlink=n;
			first=n;
		}
	}
	
	public void insertrear() {
		Node tamp;
		System.out.println("Enter an element");
		int ele=sc.nextInt();
		Node n=new Node();
		n.data=ele;
		n.prlink=null;
		n.nextlink=null;
		if(first==null) {
			first=null;
		}
		else {
			tamp=first;
			while(tamp.nextlink !=null) {
				tamp=tamp.nextlink;
			}
			tamp.nextlink=n;
			n.prlink=tamp;
		}
	}
	
	
	public void deletefront() {
		if(first==null) {
			System.out.println("Delete Not Possible");
		}
		if(first.nextlink==null) {
			System.out.println("Element Delete is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element Delete is "+first.data);
			first=first.nextlink;
			first.prlink=null;
		}
	}
	
	
	public void deleterear() {
		Node tamp;
		if(first==null) {
			System.out.println("Delete Not Possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Element Delete is "+first.data);
			first=null;
		}
		else {
			tamp=first;
			while(tamp.nextlink.nextlink !=null) {
				tamp=tamp.nextlink;
			}
			System.out.println("Element Delete is "+tamp.nextlink.data);
			tamp.nextlink=null;
		}
	}
	
	public void displayfrowared() {
		Node tamp;
		if(first==null) {
			System.out.println("Display Not Possible");
		}
		else if(first.nextlink==null) {
			System.out.println(first.data);
		}
		else {
			tamp=first;
			while(tamp !=null) {
				System.out.print(tamp.data+" ");
				tamp=tamp.nextlink;
			}
		}
		System.out.println();
	}
	
	
	public void displayrevrsed() {
		Node tamp;
		if(first==null) {
			System.out.println("Display Not Possible");
		}
		else if(first.nextlink ==null) {
			System.out.println(first.data);
		}
		else {
			tamp=first;
			while(tamp.nextlink !=null) {
				tamp=tamp.nextlink;
			}
			while(tamp !=null) {
				System.out.print(tamp.data+" ");
				tamp=tamp.prlink;
			}
		}
		System.out.println();
	}
}


public class DoubleLinkedList_App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	DoubleLinkedList d=new DoubleLinkedList();
	while(true) {
		System.out.println("Press 1 To InsertFront");
		System.out.println("Press 2 To InsertRear");
		System.out.println("Press 3 To DeleteFront");
		System.out.println("Press 4 To DeleteRear");
		System.out.println("Press 5 To DisplayFrowared");
		System.out.println("Press 6 To DisplayRevresed");
		System.out.println("Press Any Other Number To Exit");
		System.out.println("Enter Your Choise");
		   int ch=sc.nextInt();
		   switch(ch) {
		   case 1:d.insertfront();
		   break;
		   case 2:d.insertrear();
		   break;
		   case 3:d.deletefront();
		   break;
		   case 4:d.deleterear();
		   break;
		   case 5:d.displayfrowared();
		   break;
		   case 6:d.displayrevrsed();
		   break;
		   default:System.exit(0);
		   sc.close();
		   }
	}
	
}
}
