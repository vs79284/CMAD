package com.blog.library.business;

import com.blog.library.Exceptions.InvalidUserException;
import com.blog.library.Exceptions.UserAlreadyExistException;
import com.blog.library.Exceptions.UserNotFoundException;
import com.blog.library.JPA.UserJPA;
import com.blog.library.api.UserApi;
import com.blog.library.data.UserDAO;
import com.blog.library.model.User;

public class BloggerUser implements UserApi{
	UserDAO userdao = new UserJPA();

	public void add(User user) throws UserAlreadyExistException,InvalidUserException {
		if(user.getId()==null) {
			throw new InvalidUserException("Id can't be empty");
		}
		userdao.add(user);
		
	}

	public void update(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	public void delete(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String id) throws UserAlreadyExistException {
		return userdao.find(id);
	}

}
