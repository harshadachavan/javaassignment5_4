package myPack;

public class CheckStack {

	public static void main(String[] args) {
		System.out.println("Fixed Stack output :");
		FixedStack mystack1 = new FixedStack(5); 
		FixedStack mystack2 = new FixedStack(8); 
		// push some numbers onto the stack 
		for(int i=0; i<6; i++) mystack1.push(i); 
		for(int i=0; i<8; i++) mystack2.push(i); 
		// pop those numbers off the stack 
		System.out.println("Stack in mystack1:"); 
		for(int i=0; i<5; i++) 
		System.out.println(mystack1.pop()); 
		System.out.println("Stack in mystack2:"); 
		for(int i=0; i<8; i++) 
		System.out.println(mystack2.pop());
		
		System.out.println("Variable Stack output :");
		VariableStack stack = new VariableStack(2);
	        for(int i=1;i<10;i++){
	            stack.push(i);
	        }
	        for(int i=1;i<4;i++){
	            try {
	                stack.pop();
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }

	}

}
