package com.problems.problemSolving.roughdraftprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Meeting{
	int start;
	int end;
	int index;
	Meeting(int start, int end, int index){
		this.end=end;
		this.index=index;
		this.start=start;
	}
}

class myComparator implements Comparator<Meeting>{
	@Override
	public int compare(Meeting m1, Meeting m2) {
		if(m1.end<m2.end) {
			return -1;
		}
		else if(m1.end>m2.end) {
			return 1;
		}
		return 0;
	}
}

public class Nmeeting {

	public static void maxMeeting(ArrayList<Meeting> meet,int size){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int tl=0;
		myComparator mc=new myComparator();
		Collections.sort(meet,mc);//sorted with respect to end times
		ans.add(meet.get(0).index);//as its sorted the first meeting will happen obviosusly
		tl=meet.get(0).end;
		for(int i=1;i<meet.size();i++) {
			if(meet.get(i).start>tl) {
				ans.add(meet.get(i).index);
				tl=meet.get(i).end;
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i)+1 + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {1,3,0,5,8,5};
		int e[]= {2,4,6,7,9,9};
		ArrayList<Meeting> meet=new ArrayList<Meeting>();
		//make an arraylist of object that include start time end time and meeting number
		for(int i=0;i<s.length;i++) {
			meet.add(new Meeting(s[i],e[i],i));
		}
		maxMeeting(meet,meet.size());	
	}

}
