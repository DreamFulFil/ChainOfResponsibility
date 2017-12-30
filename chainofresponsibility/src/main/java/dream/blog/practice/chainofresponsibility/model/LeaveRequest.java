package dream.blog.practice.chainofresponsibility.model;

public class LeaveRequest {	
	public boolean startRequest(String user, String reason, int days) { 
		if(days < 3) {
			return deptManager(user,reason);
		}else if(days < 7) {
			return divisionManager(user,reason);
		}else {
			return chiefExecutive(user,reason);
		}
	}	
	private boolean deptManager(String user, String reason) {
		if(user.equals("george") && reason.equals("rest")) {
			System.err.println(user + "'s Leave accepted by department manager");
			return true;
		}
		return false;
	}
	private boolean divisionManager(String user, String reason) {
		if(user.equals("george") && reason.equals("rest")) {
			System.err.println(user + "'s Leave accepted by division manager");
			return true;
		}
		return false;
	}
	private boolean chiefExecutive(String user, String reason) {
		if(user.equals("george") && reason.equals("rest")) {
			System.err.println(user + "'s Leave accepted by chief executive");
			return true;
		}
		return false;
	}
}
