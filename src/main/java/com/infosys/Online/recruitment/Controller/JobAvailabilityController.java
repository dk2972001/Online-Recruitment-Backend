package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.JobAvailability;
import com.infosys.Online.recruitment.Service.JobAvailabilityService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobAvailabilityController {
	@Autowired
	JobAvailabilityService service;
	
	
	@GetMapping("/jobavailability")
	public List<JobAvailability> getAllJobAvailability(){
		
		return service.getAllJobAvailability();
		
	}
	
	
	@PostMapping("/jobavailability")
	public JobAvailability addJobAvailability(@RequestBody JobAvailability jobavailability) {
		return service.addJobAvailability(jobavailability);
	}
}


