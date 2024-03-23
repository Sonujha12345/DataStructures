package datastructures;

import java.util.Scanner;

class SinglyLinklist{
	
	class Node{
		int data;
		Node link;
		
	}
	private Node first;
	private Scanner sc=new Scanner(System.in);
	
	public void insertrear() {
		Node tamp;
		System.out.println("Enter an element ");
		int ele=sc.nextInt();
		Node n=new Node();
		n.data=ele;
		n.link=null;
		if(first==null) {
			first=n;
		
		}
		else {
			tamp=first;
			while(tamp.link!=null) {
				tamp=tamp.link;
			}
			tamp.link=n;
		}
	}
	
	public void deleterear() {
		Node tamp;
		if(first==null) {
			System.out.println("Delete Not Possible");
		}
		if(first.link==null) {
			System.out.println("Element Delete is "+first.data);
			first=null;
		}
		else {
			tamp=first;
			while(tamp.link.link!=null) {
				tamp=tamp.link;
			}
			System.out.println("Element Delete is "+tamp.link.data);
			tamp.link=null;
		}
	}
	
	public void insertfront() {
		System.out.println("Enter an element ");
		int ele=sc.nextInt();
		Node n=new Node();
		n.data=ele;
		n.link=null;
		if(first==null) {
			first=n;
		}
		else {
			n.link=first;
			first=n;
		}
	}
	
	public void deletefront() {
		if(first==null) {
			System.out.println("Delete Not Possible");
		}
		else if (first.link==null) {
			System.out.println("Element Delete is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element Delete is "+first.data);
			first=first.link;
		}
	}
	
	
	public void display() {
		Node tamp;
		if(first ==null) {
			System.out.println("Display Not Possible");
		}
		else if(first.link==null) {
			System.out.println(first.data+" ");
			
		}
		else {
			tamp=first;
			while(tamp !=null) {
				System.out.print(tamp.data+" ");
				tamp=tamp.link;
			}
			System.out.println();
		}
	}
}

public class SinglyLinkList_App {
   public static void main(String[] args) {
	   
	   
	Scanner sc=new Scanner(System.in);
	   SinglyLinklist l=new SinglyLinklist();
	   while(true) {
		   System.out.println("Press 1 To InsertRear");
		   System.out.println("Press 2 To DeleteRear");
		   System.out.println("Press 3 To InsertFront");
		   System.out.println("Press 4 To DeleteFront");
		   System.out.println("Press 5 To Display");
		   System.out.println("Press Any Other Number To Exit");
		   System.out.println("Enter Your Choise");
		   int ch=sc.nextInt();
		   switch(ch) {
		   case 1:l.insertrear();
		   break;
		   case 2:l.deleterear();
		   break;
		   case 3:l.insertfront();
		   break;
		   case 4:l.deletefront();
		   break;
		   case 5:l.display();
		   break;
		   default :System.exit(0);
		   sc.close();
		   }
		   
	   }
	
}
}
