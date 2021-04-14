package com.cg.ams.repository;

import java.util.List;

import com.cg.ams.entity.AttendanceEntity;

public interface AttendanceDAO {

	public long add(AttendanceEntity entity);
	public void update(AttendanceEntity entity);
	public void delete(AttendanceEntity entity);
	public AttendanceEntity findByName(String name);
	public AttendanceEntity findByPk(long id);
	public List<AttendanceEntity> search(AttendanceEntity entity, long pageNo, int pageSize);
	public List<AttendanceEntity> search(AttendanceEntity entity);
	
	
}
