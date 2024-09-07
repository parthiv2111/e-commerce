package com.parthiv.service;

import java.util.List;

import com.parthiv.exception.UserException;
import com.parthiv.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
