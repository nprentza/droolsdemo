package com.demo.DroolsDemo;

public class CallAssistant {
	
	private String location; /*	at_work, at_family_outing*/
	private String sonLocation; /*	e.g. at_school */
	private String activity; /*	in_meeting	*/
	private String call;	/* business, family	*/
	private String callFrom;	/*	boss, son	*/
	
	private String allowDenyCall;
	
	/* set/get Location */
	public void setLocation(String loc) {
		this.location = loc;
	}
	public String getLocation() {
		return this.location;
	}
	/* set/get sonLocation */
	public void setSonLocation(String loc) {
		this.sonLocation = loc;
	}
	public String getSonLocation() {
		return this.sonLocation;
	}
	
	/*	set/get Activity*/
	public void setActivity(String act) {
		this.activity = act;
	}
	public String getActivity() {
		return this.activity;
	}
	
	/*	a new call from family, from is optional	*/
	public void newCall_fromFamily(String from) {
		this.call = "from_family";
		this.callFrom = from;
	}
	
	/* a new call from work, from is optional	*/
	public void newCall_fromWork(String from) {
		this.call = "from_work";
		this.callFrom = from;
	}
	
	/*	new call from son, sonAtSchool is optional	*/
	public void newCall_fromSon(String sonLoc) {
		this.sonLocation = sonLoc;
	}
	
	/* get call, callFrom */
	public String getCall() {
		return this.call;
	}
	public String getCallFrom() {
		return this.callFrom;
	}
	
	/*	set/ get allowDenyCall	*/
	public void setAllowDenyCall(String decision) {
		this.allowDenyCall = decision;
	}
	
	public String getAllowDenyCall() {
		return this.allowDenyCall;
	}
	
}
