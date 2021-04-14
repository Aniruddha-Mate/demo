package com.cg.ams.service;

import java.util.List;

import com.cg.ams.entity.StudentEntity;

public interface StudentService {

	public long add(StudentEntity entity);
	public void update(StudentEntity entity);
	public void delete(StudentEntity entity);
	public StudentEntity findByName(String name);
	public StudentEntity findByPk(long id);
	public List<StudentEntity> search(StudentEntity entity, long pageNo, int pageSize);
	public List<StudentEntity> search(StudentEntity entity);
	
	
}
