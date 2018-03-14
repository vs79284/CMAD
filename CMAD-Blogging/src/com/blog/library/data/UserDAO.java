package com.blog.library.data;

import com.blog.library.model.User;

public interface UserDAO {

	public void add(User user);
	
	public User find(String id);

	public void update(User user);

	public void delete(User user);

}
