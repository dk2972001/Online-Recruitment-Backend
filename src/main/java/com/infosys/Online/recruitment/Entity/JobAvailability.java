package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobAvailability {
	@Id
	private int JobAvailabilityId;
	private String JobAvailabilityName;
	private String JobAvailabilityMobile;
	private String JobAvailabilityEmail;
	private String JobAvailabilityYOP;
	private String JobAvailabilityPercentage;
	private String JobAvailabilityLanguage;
	private String JobAvailabilityKeySkills;
	private String JobAvailabilityProject;
	private String JobAvailabilityResume;
	
	public JobAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobAvailability(int jobAvailabilityId, String jobAvailabilityName, String jobAvailabilityMobile,
			String jobAvailabilityEmail, String jobAvailabilityYOP, String jobAvailabilityPercentage,
			String jobAvailabilityLanguage, String jobAvailabilityKeySkills, String jobAvailabilityProject,
			String jobAvailabilityResume) {
		super();
		JobAvailabilityId = jobAvailabilityId;
		JobAvailabilityName = jobAvailabilityName;
		JobAvailabilityMobile = jobAvailabilityMobile;
		JobAvailabilityEmail = jobAvailabilityEmail;
		JobAvailabilityYOP = jobAvailabilityYOP;
		JobAvailabilityPercentage = jobAvailabilityPercentage;
		JobAvailabilityLanguage = jobAvailabilityLanguage;
		JobAvailabilityKeySkills = jobAvailabilityKeySkills;
		JobAvailabilityProject = jobAvailabilityProject;
		JobAvailabilityResume = jobAvailabilityResume;
	}

	public int getJobAvailabilityId() {
		return JobAvailabilityId;
	}

	public void setJobAvailabilityId(int jobAvailabilityId) {
		JobAvailabilityId = jobAvailabilityId;
	}

	public String getJobAvailabilityName() {
		return JobAvailabilityName;
	}

	public void setJobAvailabilityName(String jobAvailabilityName) {
		JobAvailabilityName = jobAvailabilityName;
	}

	public String getJobAvailabilityMobile() {
		return JobAvailabilityMobile;
	}

	public void setJobAvailabilityMobile(String jobAvailabilityMobile) {
		JobAvailabilityMobile = jobAvailabilityMobile;
	}

	public String getJobAvailabilityEmail() {
		return JobAvailabilityEmail;
	}

	public void setJobAvailabilityEmail(String jobAvailabilityEmail) {
		JobAvailabilityEmail = jobAvailabilityEmail;
	}

	public String getJobAvailabilityYOP() {
		return JobAvailabilityYOP;
	}

	public void setJobAvailabilityYOP(String jobAvailabilityYOP) {
		JobAvailabilityYOP = jobAvailabilityYOP;
	}

	public String getJobAvailabilityPercentage() {
		return JobAvailabilityPercentage;
	}

	public void setJobAvailabilityPercentage(String jobAvailabilityPercentage) {
		JobAvailabilityPercentage = jobAvailabilityPercentage;
	}

	public String getJobAvailabilityLanguage() {
		return JobAvailabilityLanguage;
	}

	public void setJobAvailabilityLanguage(String jobAvailabilityLanguage) {
		JobAvailabilityLanguage = jobAvailabilityLanguage;
	}

	public String getJobAvailabilityKeySkills() {
		return JobAvailabilityKeySkills;
	}

	public void setJobAvailabilityKeySkills(String jobAvailabilityKeySkills) {
		JobAvailabilityKeySkills = jobAvailabilityKeySkills;
	}

	public String getJobAvailabilityProject() {
		return JobAvailabilityProject;
	}

	public void setJobAvailabilityProject(String jobAvailabilityProject) {
		JobAvailabilityProject = jobAvailabilityProject;
	}

	public String getJobAvailabilityResume() {
		return JobAvailabilityResume;
	}

	public void setJobAvailabilityResume(String jobAvailabilityResume) {
		JobAvailabilityResume = jobAvailabilityResume;
	}

	@Override
	public String toString() {
		return "JobAvailability [JobAvailabilityId=" + JobAvailabilityId + ", JobAvailabilityName="
				+ JobAvailabilityName + ", JobAvailabilityMobile=" + JobAvailabilityMobile + ", JobAvailabilityEmail="
				+ JobAvailabilityEmail + ", JobAvailabilityYOP=" + JobAvailabilityYOP + ", JobAvailabilityPercentage="
				+ JobAvailabilityPercentage + ", JobAvailabilityLanguage=" + JobAvailabilityLanguage
				+ ", JobAvailabilityKeySkills=" + JobAvailabilityKeySkills + ", JobAvailabilityProject="
				+ JobAvailabilityProject + ", JobAvailabilityResume=" + JobAvailabilityResume + "]";
	}
	
	
	

}
