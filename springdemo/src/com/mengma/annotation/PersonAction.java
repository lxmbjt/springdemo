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
        personService.add(); // ����personService�е�add()����
        System.out.println("Action���add()����ִ����...");
    }
}