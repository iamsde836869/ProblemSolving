package com.problems.problemSolving.roughdraftprograms;

class SD implements Runnable{
	private Thread t;
	private String TN;
	SD(String TN){
		this.TN=TN;
	}
	public void run() {
		while(true)System.out.println(TN);
	}
	public void start() {
		if(t==null) {
			t=new Thread(this, TN);
			t.start();
		}
	}
}
public class EmptyFileAlways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0101;
		//System.out.println(i);
		SD A=new SD("A");
		SD B=new SD("B");
		B.start();
		A.start();
	}

}
