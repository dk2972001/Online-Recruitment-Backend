package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.JobAvailability;
import com.infosys.Online.recruitment.Repositary.JobAvailabilityRepositary;
@Service
public class JobAvailabilityService implements JobAvailabilityInterface {
	@Autowired
	JobAvailabilityRepositary repository;
	
	@Override
	public List<JobAvailability> getAllJobAvailability() {
		
		return repository.findAll();
	}

	@Override
	public JobAvailability addJobAvailability(JobAvailability jobavailability) {
		
		return repository.save(jobavailability);
	}
}
