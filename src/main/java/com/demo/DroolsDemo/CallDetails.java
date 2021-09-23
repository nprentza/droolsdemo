package com.demo.DroolsDemo;

public class CallDetails {
	
	private String location;
	private String activity;
	private String call;
	private String callFrom;
	private String allowDenyCall;
	
	/* set */
	
	public CallDetails() {
		
	}
	
	public CallDetails(String loc, String act) {
		this.location = loc;
		this.activity = act;
	}
	
	public void setLocation(String loc) {
		this.location = loc;
	}
	
	public void setActivity(String act) {
		this.activity = act;
	}
	
	public void incomingCall(String call, String from) {
		this.call = call;
		this.callFrom = from;
	}
	
	public void setAllowDenyCall(String allowDeny) {
		this.allowDenyCall = allowDeny;
	}
	
	/* get */
	
	public String getLocation() {
		return this.location;
	}

	public String getActivity() {
		return this.activity;
	}
		
	public String getCall() {
		return this.call;
	}
	
	public String getCallFrom() {
		return this.callFrom;
	}
	
	public String getAllowDenyCall() {
		return this.allowDenyCall;
	}
	
	

}
