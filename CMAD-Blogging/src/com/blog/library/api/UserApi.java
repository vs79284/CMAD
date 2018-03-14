package com.blog.library.api;

import com.blog.library.Exceptions.UserAlreadyExistException;
import com.blog.library.Exceptions.UserNotFoundException;
import com.blog.library.model.User;

public interface UserApi {

	public void add(User user) throws UserAlreadyExistException;

	public User get(String userId) throws UserAlreadyExistException;

	public void update(User user) throws UserNotFoundException;

	public void delete(User user) throws UserNotFoundException;

}
