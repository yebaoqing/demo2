package com.imooc.demo;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private AreaDao areaDao;

	@Test
	public void queryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2,areaList.size());
	}


	@Test
	public void contextLoads() {
	}

}
