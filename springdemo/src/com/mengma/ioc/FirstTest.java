package com.mengma.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {
	
	
	    public void testl() {
	        // ����Spring�����ļ���·��
	        String xmlPath = "applicationContext.xml";
	        // ��ʼ��Spring���������������ļ�
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
	                xmlPath);
	        // ͨ��������ȡpersonDaoʵ��
	        PersonDao personDao = (PersonDao) applicationContext
	                .getBean("personDao");
	        // ���� personDao �� add ()����
	        personDao.add();
	    }
	    
	    @Test
	    public void test2() {
	        // ����Spring�����ļ���·��
	        String xmlPath = "applicationContext.xml";
	        // ��ʼ��Spring���������������ļ�
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
	                xmlPath);
	        // ͨ��������ȡpersonServiceʵ��
	        PersonService personService = (PersonService) applicationContext
	                .getBean("personService");
	        // ����personService��addPerson()����
	        personService.addPerson();
	    }
}
