package com.amsidh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.dao.impl.MySimpleJdbcDaoSupport;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		/*CircleDao circleDao = context.getBean("circleDaoImpl", CircleDao.class);
		
		System.out.println("---getCircleById method-------");
		Circle circle=circleDao.getCircleById(1);
		System.out.println("Circle ID= "+circle.getId()+" Name= "+circle.getName());
		System.out.println("Total Circles : "+circleDao.getCircleCount());
		System.out.println("-----getAllCircle method-------");
		List<Circle> circleList=circleDao.getAllCircle();
		for(Circle c:circleList)
		{
			System.out.println("Circle ID= "+c.getId()+" Name= "+c.getName());
		}
		*/
		MySimpleJdbcDaoSupport mySimpleJdbcDaoSupport=context.getBean(MySimpleJdbcDaoSupport.class);
		System.out.println(mySimpleJdbcDaoSupport.getCircleCount());
	}

}
