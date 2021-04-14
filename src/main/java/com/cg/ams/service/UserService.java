package com.cg.ams.service;

import java.util.List;

import com.cg.ams.entity.UserEntity;
public interface UserService {

	public long add(UserEntity entity);
	public void update(UserEntity entity);
	public void delete(UserEntity entity);
	public UserEntity findByLogin(String login);
	public UserEntity findByPk(long id);
	public List<UserEntity> search(UserEntity entity, long pageNo, int pageSize);
	public List<UserEntity> search(UserEntity entity);
	public UserEntity authenticate(UserEntity entity);
	public boolean changePassword(Long id, String oldPassword,
            String newPassword) ;
    public long registerUser(UserEntity entity);
    public boolean forgetPassword(String login);
}
