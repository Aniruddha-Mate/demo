package com.cg.ams.repository;

import java.util.List;

import com.cg.ams.entity.UserEntity;
public interface UserDAO {

	public long add(UserEntity entity);
	public void update(UserEntity entity);
	public void delete(UserEntity entity);
	public UserEntity findByLogin(String login);
	public UserEntity findByPk(long id);
	public List<UserEntity> search(UserEntity entity, long pageNo, int pageSize);
	public List<UserEntity> search(UserEntity entity);
	public UserEntity authenticate(UserEntity entity);
	
}
