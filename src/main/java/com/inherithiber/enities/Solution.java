package com.inherithiber.enities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="solution")
public class Solution {
	@Id
	int solutionId;
	@OneToOne
	@JoinColumn(referencedColumnName = "issueId", name="issue_id")
	Issue issue;
	@OneToOne
	@JoinColumn(referencedColumnName = "operatorId", name="operator_id")
	Operator operator;
	String solutionDescription;
	LocalDate solutionDate;
	public Solution() {
		super();
	}
	public Solution(int solutionId, String solutionDescription, LocalDate solutionDate) {
		super();
		this.solutionId = solutionId;
		this.solutionDescription = solutionDescription;
		this.solutionDate = solutionDate;
	}
	public int getSolutionId() {
		return solutionId;
	}
	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionDescription() {
		return solutionDescription;
	}
	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	public LocalDate getSolutionDate() {
		return solutionDate;
	}
	public void setSolutionDate(LocalDate solutionDate) {
		this.solutionDate = solutionDate;
	}
	@Override
	public String toString() {
		return "Solution [solutionId=" + solutionId + ", solutionDescription=" + solutionDescription + ", solutionDate="
				+ solutionDate + "]";
	}
	
}
