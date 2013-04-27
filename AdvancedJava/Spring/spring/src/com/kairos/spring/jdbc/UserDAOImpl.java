package com.kairos.spring.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;


public class UserDAOImpl {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	//C
	
	public void saveUser(String username,String password,String firstname,String lastname){
		
		String sql = "insert into user(username,password,firstname,lastname) values(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{username,password,firstname,lastname});
        }
	
	//D
	
	public void deleteUser(String username){
		
		String sql ="Delete from user where username=?";
		jdbcTemplate.update(sql,new Object[]{username});
	}
	
	//U
	
	public void updateUser(String username,String password){
		String sql ="update user set password=? where username=?";
		jdbcTemplate.update(sql, new Object[]{password,username});
	}
	
	
	public User getUser(String username){
		
		String sql ="select * from user where username=?";
		
		User user = (User)jdbcTemplate.queryForObject(sql,new Object[]{username},
				
				new RowMapper() {
			@Override
			public Object mapRow(ResultSet resultSet, int arg1)
					throws SQLException {
						return new User(resultSet.getString("username"),"XXXXXX",resultSet.getString("firstname"),resultSet.getString("lastname"));
			}
		});
		
		
		return user;
	}
	
	
	public User getUserById(String username){
		
		String sql = "select * from user where username=?";
	User users =	(User)jdbcTemplate.query(sql, new Object[]{username},new BeanPropertyRowMapper(User.class));
		
	return users;
		
		
	}
	
	
	public List<User> getAllUsers(){
		
		String sql = "select * from user";
		
		List<User> users = jdbcTemplate.query(sql,new UserMapper());
		
		return users;
	}
	
}
