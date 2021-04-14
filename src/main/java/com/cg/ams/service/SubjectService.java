package com.cg.ams.service;

import java.util.List;

import com.cg.ams.entity.SubjectEntity;

public interface SubjectService {

	public long add(SubjectEntity entity);
	public void update(SubjectEntity entity);
	public void delete(SubjectEntity entity);
	public SubjectEntity findByName(String name);
	public SubjectEntity findByPk(long id);
	public List<SubjectEntity> search(SubjectEntity entity, long pageNo, int pageSize);
	public List<SubjectEntity> search(SubjectEntity entity);
	
	
}
