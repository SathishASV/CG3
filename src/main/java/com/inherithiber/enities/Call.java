package com.inherithiber.enities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="call")
public class Call {

	@Id
	int callId;
	@OneToOne
	@JoinColumn(referencedColumnName = "customerId",name="customer_id")
	Customer customer;
	@OneToOne
	@JoinColumn(referencedColumnName = "operatorId",name="operator_id")
	Operator operator;
	@OneToOne
	@JoinColumn(referencedColumnName = "issueId",name="issue_id")
	Issue issue;
	LocalDate callDate;
	double callDuartion;
	String phoneNumber;
	public Call(int callId, LocalDate callDate, double callDuartion, String phoneNumber) {
		super();
		this.callId = callId;
		this.callDate = callDate;
		this.callDuartion = callDuartion;
		this.phoneNumber = phoneNumber;
	}
	public Call() {
		super();
	}
	
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public LocalDate getCallDate() {
		return callDate;
	}
	public void setCallDate(LocalDate callDate) {
		this.callDate = callDate;
	}
	public double getCallDuartion() {
		return callDuartion;
	}
	public void setCallDuartion(double callDuartion) {
		this.callDuartion = callDuartion;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callDate=" + callDate + ", callDuartion=" + callDuartion + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
