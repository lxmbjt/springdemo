package com.mengma.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
@Controller("personAction")
public class PersonAction {
    @Resource(name = "personService")
    private PersonService personService;
    public PersonService getPersonService() {
        return personService;
    }
    public void add() {
        personService.add(); // 调用personService中的add()方法
        System.out.println("Action层的add()方法执行了...");
    }
}