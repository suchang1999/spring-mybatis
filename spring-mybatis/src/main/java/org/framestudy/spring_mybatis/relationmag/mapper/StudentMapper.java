package org.framestudy.spring_mybatis.relationmag.mapper;

import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface StudentMapper {
	public Students getStudentWithClassByStudentId(int id);
}
