package com.problems.problemSolving.roughdraftprograms;

public class PredictTheOutput {

private int x=10;
protected int y=10;
protected PredictTheOutput() {
	this(5);
	System.out.print("Constructor with no parameters called");

}
private PredictTheOutput(int x) {
	this(x,15);
	System.out.print("Constructor with 1 parameters called");

}
protected PredictTheOutput(int x, int y) {
	System.out.print(x*y);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	new PredictTheOutput();	
	}

}
