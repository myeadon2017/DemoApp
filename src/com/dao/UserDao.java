package com.dao;

import com.model.Login;
import com.model.Registration;

public interface UserDao {
	
	public void registration(Registration reg);
	public void login();

}
