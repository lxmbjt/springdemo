package com.mengma.ioc;

public class PersonServiceImpl implements PersonService{
	// ����ӿ�����
    private PersonDao personDao;

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		 personDao.add(); // ����PersonDao�е�add()����
	        System.out.println("addPerson()ִ����...");
	}
	// �ṩset()��������������ע��
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    
}
