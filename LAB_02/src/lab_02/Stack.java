package lab_02;
import java.util.Scanner;
public class Stack 
{
	private int MAX_VALUE = 10;
	private int[] stackArray;
	private int  top;
	
	public Stack()
	{
		stackArray = new int[MAX_VALUE];
		top = -1;
	}
    public void push(int item)
    {
    	if(top == MAX_VALUE - 1)
    	{
    		System.out.println("\nStack Overflow. Cannot Push Value : "+item);
    		return;
    	}
    	else
    	{
    		top = top + 1;
    		stackArray[top] = item;
    		System.out.println("\nPushed value is : "+ item);
    	}
    }
    public int pop()
    {
    	 int item;
    	 if(top == -1)
    	 {
    		 System.out.println("\nStack Underflow, Cannot Pop!!.");
    		 return -1;
    	 }
    	 else
    	 {
    		 item = stackArray[top];
    		 top = top -1;
    		 return item;
    	 }
    }
    public void peek()
    {
	   	 if(top == -1)
	   	 {
	   		 System.out.println("\nStack is empty, Cannot Peek!!.");
	   	 }    	
	   	 else
	   	 {
	   		 System.out.println("\nPeeked : "+stackArray[top]);
	   	 }
    }
    public void display()
    {
    	if(top == -1)
    	{
    		System.out.println("\nStack Undeflow!!");
    	}
    	else
    	{
    		System.out.println("\nStack Contents: \n");
    		for(int i=top;i>=0;i--)
    		{
    			System.out.print("|"+stackArray[i]+"|\n");
    		}
    		System.out.println();
    	}
    }
    public boolean isEmpty()
    {
    	return top == -1;
    }
    public boolean isFull()
    {
    	return top == MAX_VALUE-1;
    }
	public static void main(String[] args) 
	{
    	int item;
        Stack stack = new Stack();
        Scanner s = new Scanner(System.in);
        int choice;
        
        do
        {
        	System.out.println("\nStack Menu: \n");
        	System.out.println("\n1- > Push . \n");
        	System.out.println("\n2 -> Pop . \n");
        	System.out.println("\n3 -> Peek .\n");
        	System.out.println("\n4 -> Display. \n");
        	System.out.println("\n5 -> isEmpty. \n");
        	System.out.println("\n6 -> isFull. \n");
        	System.out.println("\n0 -> Exit . \n");
        	choice = s.nextInt();
        	switch(choice)
        	{
        	case 1: System.out.println("\nEnter the value to be Pushed.");
        	        item = s.nextInt();
        	        stack.push(item);
        	        break;
        	        
        	case 2: item = stack.pop();
        	        if(item != -1)
        	        {
        	        	System.out.println("\nPopped Item is "+item);
        	        }
        	        break;
        	      
        	case 3: stack.peek();
        	        break;
        	    
        	case 4: stack.display();
        	        break;
        	        
        	case 5: System.out.println("\nIs The Stack Empty ? : "+stack.isEmpty());
        	        break;
        	        
        	case 6: System.out.println("\nIs The Stack Full ? :"+ stack.isFull());
        	        break;
        	         
        	        
        	default: System.out.println("\nEnter a Valid Input.");
        	}
        	
        } 
        while(choice!=0);
        s.close();
	}
}
