package myPack;

public class FixedStack implements Stack{
	
	private int stck[]; 
	private int tos; 
	// allocate and initialize stack 
	FixedStack(int size) { 
	stck = new int[size]; 
	tos = -1; 
	} 
	
	// Push an item onto the stack 
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if(tos==stck.length-1) // use length member 
			System.out.println("Stack is full."); 
			else 
			stck[++tos] = i; 
	}
	
	// Pop an item from the stack 
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(tos < 0) { 
			System.out.println("Stack underflow."); 
			return 0; 
			} 
			else 
			return stck[tos--]; 
	}
}
