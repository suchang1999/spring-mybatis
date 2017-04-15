package org.framestudy.spring_mybatis.animalmsg.dao;

import java.util.List;

import org.framestudy.spring_mybatis.animalmsg.beans.Dog;
import org.framestudy.spring_mybatis.animalmsg.beans.Pet;

public interface IPetDao {
	public int saveDog(Dog dog);
	public Dog getDogById(Long id);
	public List<Pet> getAllPet();
}
