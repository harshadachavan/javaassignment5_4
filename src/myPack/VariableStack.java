package myPack;

public class VariableStack implements Stack {
	 	private int stackSize;
	    private int[] stackArr;
	    private int top;
	 
	    /**
	     * constructor to create stack with size
	     * @param size
	     */
	    
	    public VariableStack(int size) {
	    	this.stackSize = size;
	    	this.stackArr = new int[stackSize];
	    	this.top = -1;
	    	}
	    
	    public void push(int entry){
	    	if(this.isStackFull()){
	            System.out.println(("Stack is full. Increasing the capacity."));
	            this.increaseStackCapacity();
	        }
	        System.out.println("Adding: "+entry);
	        this.stackArr[++top] = entry;
	    }
	    
	    public int pop() {
	        if(this.isStackEmpty()){
	        	System.out.println("Stack is empty. Can not remove element.");
	        }
	        int entry = this.stackArr[top--];
	        System.out.println("Removed entry: "+entry);
	        return entry;
	    }
	    
	    private void increaseStackCapacity(){
	         
	        int[] newStack = new int[this.stackSize*2];
	        for(int i=0;i<stackSize;i++){
	            newStack[i] = this.stackArr[i];
	        }
	        this.stackArr = newStack;
	        this.stackSize = this.stackSize*2;
	    }
	    
	    public boolean isStackEmpty() {
	        return (top == -1);
	    }
	 
	    /**
	     * This method returns true if the stack is full
	     * @return
	     */
	    public boolean isStackFull() {
	        return (top == stackSize - 1);
	    }
}
