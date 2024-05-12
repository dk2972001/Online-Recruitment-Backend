package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.User;
import com.infosys.Online.recruitment.Repositary.UserRepositary;

@Service
public class UserService implements UserInterface {

	@Autowired
	UserRepositary repository;
	
	@Override
	public List<User> getAllUsers() {
		
		return repository.findAll();
	}

	@Override
	public User addUser(User user) {
		
		return repository.save(user);
	}

	@Override
	public Optional<User> getUserId(Integer userId){
		
		return repository.findById(userId);
	}
	
	@Override
	public User updateUser(Integer userId,User user) throws Exception {
		
		Optional<User> existingUserOptional = repository.findById(userId);
		
		if(existingUserOptional.isPresent()) {
			
			User existingUser = existingUserOptional.get();
			
			existingUser.setAddress(user.getAddress());
			existingUser.setPassword(user.getPassword());
			
			return repository.save(existingUser);
		}
		else {
			
		throw new Exception("User Not Found");
		
		     }
	}
	
	@Override
	public void deleteUser(Integer userId) {
		
		repository.deleteById(userId);
	}
}
