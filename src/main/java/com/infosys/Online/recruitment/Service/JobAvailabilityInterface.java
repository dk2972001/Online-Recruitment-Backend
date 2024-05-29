package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.JobAvailability;


public interface JobAvailabilityInterface {
	public List<JobAvailability> getAllJobAvailability();
	public JobAvailability addJobAvailability(JobAvailability jobavailability);
}
