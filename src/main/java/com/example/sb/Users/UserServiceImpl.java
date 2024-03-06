package com.example.sb.Users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	private UserDao uDao;
	@Override
	public User getUserByUid(String uid) {
		User user = uDao.getUser(uid);
		return user;
	}

	@Override
	public List<User> getUserList(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUserCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(String uid, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
