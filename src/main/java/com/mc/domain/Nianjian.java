package com.mc.domain;

import java.math.BigInteger;

public class Nianjian {

	private BigInteger nid;
	private String nname;
	private String nmiaoshu;
	private String ngongsi;
	private String nzhuying;
	private String naddress;
	private String nzhuce;
	private String ntime;
	private String ndate;
	private String nstatu;
	private String nbeizhu;
	public BigInteger getNid() {
		return nid;
	}
	public void setNid(BigInteger nid) {
		this.nid = nid;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getNmiaoshu() {
		return nmiaoshu;
	}
	public void setNmiaoshu(String nmiaoshu) {
		this.nmiaoshu = nmiaoshu;
	}
	public String getNgongsi() {
		return ngongsi;
	}
	public void setNgongsi(String ngongsi) {
		this.ngongsi = ngongsi;
	}
	public String getNzhuying() {
		return nzhuying;
	}
	public void setNzhuying(String nzhuying) {
		this.nzhuying = nzhuying;
	}
	public String getNaddress() {
		return naddress;
	}
	public void setNaddress(String naddress) {
		this.naddress = naddress;
	}
	public String getNzhuce() {
		return nzhuce;
	}
	public void setNzhuce(String nzhuce) {
		this.nzhuce = nzhuce;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public String getNstatu() {
		return nstatu;
	}
	public void setNstatu(String nstatu) {
		this.nstatu = nstatu;
	}
	public String getNbeizhu() {
		return nbeizhu;
	}
	public void setNbeizhu(String nbeizhu) {
		this.nbeizhu = nbeizhu;
	}
	@Override
	public String toString() {
		return "Nianjian [nid=" + nid + ", nname=" + nname + ", nmiaoshu=" + nmiaoshu + ", ngongsi=" + ngongsi
				+ ", nzhuying=" + nzhuying + ", naddress=" + naddress + ", nzhuce=" + nzhuce + ", ntime=" + ntime
				+ ", ndate=" + ndate + ", nstatu=" + nstatu + ", nbeizhu=" + nbeizhu + "]";
	}
	public Nianjian(BigInteger nid, String nname, String nmiaoshu, String ngongsi, String nzhuying, String naddress,
			String nzhuce, String ntime, String ndate, String nstatu, String nbeizhu) {
		super();
		this.nid = nid;
		this.nname = nname;
		this.nmiaoshu = nmiaoshu;
		this.ngongsi = ngongsi;
		this.nzhuying = nzhuying;
		this.naddress = naddress;
		this.nzhuce = nzhuce;
		this.ntime = ntime;
		this.ndate = ndate;
		this.nstatu = nstatu;
		this.nbeizhu = nbeizhu;
	}
	public Nianjian() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNid(int parseInt) {
		// TODO Auto-generated method stub
		
	}
	
	
}
