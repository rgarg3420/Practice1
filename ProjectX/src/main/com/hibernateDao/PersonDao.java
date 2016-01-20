package main.com.hibernateDao;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import main.com.entity.PersonEntity.Person;
import main.com.util.HibernateUtil;

public class PersonDao {

    
  public Person getPersonById(int id){
      
      Session session = HibernateUtil.getSessionFactory().openSession();
      
     
       Person person  = new Person();
      
      try{
	  if(0 ==id){
	      id = 101;
	  }
      session.getTransaction().begin();
      Criteria cr  = session.createCriteria(Person.class);
      
      cr.add(Restrictions.eq("personID", id));
      
      person = (Person) cr.uniqueResult();
      
      //session.getTransaction().commit();
      
      System.out.println("Person :"+ person.getFirstName()+": "+person.getLastName());
      
      session.close();
      } catch(HibernateException he ){
	  he.printStackTrace();
	  //session.getTransaction().rollback();
      }
      return person;
  }
    
}
