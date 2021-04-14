package com.cg.ams.repository;

import java.util.List;

import com.cg.ams.entity.CourseEntity;

public interface CourseDAO {

	public long add(CourseEntity entity);
	public void update(CourseEntity entity);
	public void delete(CourseEntity entity);
	public CourseEntity findByName(String name);
	public CourseEntity findByPk(long id);
	public List<CourseEntity> search(CourseEntity entity, long pageNo, int pageSize);
	public List<CourseEntity> search(CourseEntity entity);
	
	
}
