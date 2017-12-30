package dream.blog.practice.chainofresponsibility;

import dream.blog.practice.chainofresponsibility.model.LeaveRequest;

public class ChainOfResponsibilityMain{
	public static void main(String[] args) {
		LeaveRequest request = new LeaveRequest();
		int days = 2;
		String user = "george";
		String reason = "rest";
		System.err.println("Leave accepted:"+ request.startRequest(user, reason, days));
		days = 5;
		System.err.println("Leave accepted:"+ request.startRequest(user, reason, days));
		days = 12;
		System.err.println("Leave accepted:"+ request.startRequest(user, reason, days));
	}	
}
