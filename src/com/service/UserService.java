package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dal.DBCon;
import com.dao.UserDao;
import com.model.Registration;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class UserService implements UserDao{

	String sql="insert into emp(empname,email,city) values(?,?,?)";

	@Override
	public void registration(Registration reg) {
		System.out.println("inside service");

		try {
			DBCon db= new DBCon();
			Connection conn= db.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, reg.getUname());
			pst.setString(2, reg.getEmail());
			pst.setString(3, reg.getCity());

			int i = pst.executeUpdate();
			if (i > 0) {

				System.out.println(("user is registered"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}