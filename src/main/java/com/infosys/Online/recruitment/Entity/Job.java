package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
	
	@Id
	private int jobID;
	
	private String jobName;
	private String salary;
	private String jobType;
	private String jobDescription;
	private String jobVaccancy;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(int jobID, String jobName, String salary, String jobType, String jobDescription, String jobVaccancy) {
		super();
		this.jobID = jobID;
		this.jobName = jobName;
		this.salary = salary;
		this.jobType = jobType;
		this.jobDescription = jobDescription;
		this.jobVaccancy = jobVaccancy;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobVaccancy() {
		return jobVaccancy;
	}

	public void setJobVaccancy(String jobVaccancy) {
		this.jobVaccancy = jobVaccancy;
	}

	@Override
	public String toString() {
		return "Job [jobID=" + jobID + ", jobName=" + jobName + ", salary=" + salary + ", jobType=" + jobType
				+ ", jobDescription=" + jobDescription + ", jobVaccancy=" + jobVaccancy + "]";
	}
	
	
	

}
