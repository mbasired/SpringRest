package com.cg.demo.model;

public class Employee {
	
	private String eid;
	private String ename;
	private String esal;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String eid, String ename, String esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eid=");
		builder.append(eid);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", esal=");
		builder.append(esal);
		builder.append("]");
		return builder.toString();
	}
	
}
