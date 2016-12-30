package org.jarvis.item.controller;

import java.util.List;

import org.jarvis.item.model.Item;
import org.jarvis.item.model.dao.ItemDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_database.xml");
		
		ItemDao itemdao = context.getBean(ItemDao.class);
		
		List<Item> list = itemdao.list();
		
		for(Item p : list){
			
			System.out.println(p.getAsin());
			System.out.println(p.getItemId());
		}
		//close resources
		context.close();	
	}
	
}
