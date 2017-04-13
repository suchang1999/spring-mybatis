package org.framestudy.spring_mybatis.test.service;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IWifeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestWifeDao {
	
	@Resource
	private IWifeDao wifeDaoImpl;
	
	@Test
	public void testGetWifeWithHusbandByWifeId(){
		Wife wife = wifeDaoImpl.getWifeWithHusbandByWifeId(5);
		System.out.println(wife);
	}
}
