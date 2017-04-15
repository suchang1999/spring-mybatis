package org.framestudy.spring_mybatis.animalmsg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.animalmsg.beans.Dog;
import org.framestudy.spring_mybatis.animalmsg.beans.Pet;

public interface PetMapper {
	public int saveDog(@Param("dog")Dog dog);
	public Dog getDogById(Long id);
	public List<Pet> getAllPet();
}
