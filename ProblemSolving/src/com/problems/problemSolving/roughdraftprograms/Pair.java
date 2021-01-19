package com.problems.problemSolving.roughdraftprograms;
import java.util.List;
public class Pair<X,Y> {
X x;
Y y;
	public Pair(X x, Y y) {
	this.x=x;
	this.y=y;
}	
	public void display() {
		System.out.print("X is :" + x + "Y is :" +y );
	}
}
