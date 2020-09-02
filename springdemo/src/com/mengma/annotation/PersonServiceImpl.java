package com.mengma.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    private PersonDao personDao;
    public PersonDao getPersonDao() {
        return personDao;
    }
    @Override
    public void add() {
        personDao.add();// ����personDao�е�add()����
        System.out.println("Service���add()����ִ����...");
    }
}