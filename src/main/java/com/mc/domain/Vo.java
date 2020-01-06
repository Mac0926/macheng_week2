package com.mc.domain;

public class Vo {

	private String id;
	private String gongsiname;
	private String address;
	private String ziben;
	private String p1;
	private String p2;
	private String r1;
	private String r2;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGongsiname() {
		return gongsiname;
	}
	public void setGongsiname(String gongsiname) {
		this.gongsiname = gongsiname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZiben() {
		return ziben;
	}
	public void setZiben(String ziben) {
		this.ziben = ziben;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getR1() {
		return r1;
	}
	public void setR1(String r1) {
		this.r1 = r1;
	}
	public String getR2() {
		return r2;
	}
	public void setR2(String r2) {
		this.r2 = r2;
	}
	@Override
	public String toString() {
		return "Vo [id=" + id + ", gongsiname=" + gongsiname + ", address=" + address + ", ziben=" + ziben + ", p1="
				+ p1 + ", p2=" + p2 + ", r1=" + r1 + ", r2=" + r2 + "]";
	}
	public Vo(String id, String gongsiname, String address, String ziben, String p1, String p2, String r1, String r2) {
		super();
		this.id = id;
		this.gongsiname = gongsiname;
		this.address = address;
		this.ziben = ziben;
		this.p1 = p1;
		this.p2 = p2;
		this.r1 = r1;
		this.r2 = r2;
	}
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
