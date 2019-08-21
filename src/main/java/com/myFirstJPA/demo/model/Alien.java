package com.myFirstJPA.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private int aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getAname() {
		return aname;
	}
	public void setAname(int aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
