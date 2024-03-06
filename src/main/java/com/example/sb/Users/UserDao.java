package com.example.sb.Users;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDao {

	@Select("select * from users where uid=#{uid}")
	User getUser(String Uid);
	
	@Select("selet * from users where isDeleted=0 limit #{count} offset #{offset}"
	+ " order by regDate desc")
	
	List<User> getUserList(int count, int offset);
	
	@Insert("insert into users values (#{uid}, #{pwd}, #{uname}, #{email}, default, default)")
	void insertUser(User user);
	
	@Update("update users set pwd=#{pwd}, uname=#{uname}, email=#{email} where uid=#{uid}")
	void updateUser(User user);
	
	@Update("update users set pwd=#{pwd}, uname=#{uname}, email=#{email} where uid=#{uid}")
	void updateUser(User user);
	
	@somthing?
}
