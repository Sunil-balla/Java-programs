/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    Node head;
    
    public boolean isEmpty() {
        return(head == null);
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }
    
    public void insertLast(int data) {
        Node newNode = new Node(data);
        
        if(isEmpty()) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
    }
    
    public void deleteFirst() {
        if(isEmpty()) {
            System.out.println("No elements");
            return;
        }
        
        head = head.next;
    }
    
    public void deleteLast() {
        if(isEmpty()) {
            System.out.println("No elements");
            return;
        }
        
        Node last = head;
        Node secondLast = null;
        
        while(last.next != null) {
            secondLast = last;
            last = last.next;
        }
        
        secondLast.next = null;
    }
    
    public void display() {
        
        if(isEmpty()) {
            System.out.println("No elements");
            return;
        }
        
        // Node temp = head;
        
        System.out.print("List: ");
        
        for(Node temp = head; temp != null; temp = temp.next) {
               System.out.print(temp.data + "-->");
        }
        // while(temp != null) {
        //     System.out.print(temp.data + "-->");
        //     temp = temp.next;
        // }
        System.out.println("Null");
    }
    
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Main newNode = new Main();
		
		newNode.insertFirst(2);
		
		newNode.insertFirst(1);
		
		newNode.insertLast(3);
		
		newNode.deleteFirst();
		
		newNode.deleteLast();
		
		newNode.display();
		
	}
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}
