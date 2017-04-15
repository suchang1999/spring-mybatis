package org.framestudy.spring_mybatis.animalmsg.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.animalmsg.beans.Dog;
import org.framestudy.spring_mybatis.animalmsg.beans.Pet;
import org.framestudy.spring_mybatis.animalmsg.dao.IPetDao;
import org.framestudy.spring_mybatis.animalmsg.mapper.PetMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PetDaoImpl implements IPetDao {
	
	private PetMapper pm;
	
	public void setSession(SqlSession session){
		pm = session.getMapper(PetMapper.class);
	}
	
	public int saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return pm.saveDog(dog);
	}

	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return pm.getDogById(id);
	}

	public List<Pet> getAllPet() {
		// TODO Auto-generated method stub
		return pm.getAllPet();
	}

}
