package org.framestudy.spring_mybatis.relationmag.mapper;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;

public interface ClassMapper {
	public Classes getClassesWithStusByClassId(int id);
}
