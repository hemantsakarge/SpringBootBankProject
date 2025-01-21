package com.cjc.main.bank.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int tid;
	private	String type;
	private LocalDateTime ldt;
	private double traAmt;
	private int senderAcc;
	private int recieverAcc;
	private String senderName;
	private String recieverName;
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getRecieverName() {
		return recieverName;
	}
	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}
	public int getSenderAcc() {
		return senderAcc;
	}
	public void setSenderAcc(int senderAcc) {
		this.senderAcc = senderAcc;
	}
	public int getRecieverAcc() {
		return recieverAcc;
	}
	public void setRecieverAcc(int recieverAcc) {
		this.recieverAcc = recieverAcc;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	
	public double getTraAmt() {
		return traAmt;
	}
	public void setTraAmt(double traAmt) {
		this.traAmt = traAmt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [traAmt=" + traAmt + ", type=" + type + "]";
	}
	
	
}
