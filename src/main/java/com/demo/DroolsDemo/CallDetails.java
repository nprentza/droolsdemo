package com.demo.DroolsDemo;

public class CallDetails {
	
	private String Location;
	private String Activity;
	private String Call;
	private String CallFrom;
	private String AllowDenyCall;
	
	/* set */
	
	public CallDetails() {
		
	}
	
	public CallDetails(String loc, String act) {
		this.Location = loc;
		this.Activity = act;
	}
	
	public void setLocation(String loc) {
		this.Location = loc;
	}
	
	public void setActivity(String act) {
		this.Activity = act;
	}
	
	public void incomingCall(String call, String from) {
		this.Call = call;
		this.CallFrom = from;
	}
	
	public void setAllowDeny(String allowDeny) {
		this.AllowDenyCall = allowDeny;
	}
	
	/* get */
	
	public String getLocation() {
		return this.Location;
	}

	public String getActivity() {
		return this.Activity;
	}
		
	public String getCall() {
		return this.Call;
	}
	
	public String getcallFrom() {
		return this.CallFrom;
	}
	
	public String getAllowDeny() {
		return this.AllowDenyCall;
	}
	
	

}
