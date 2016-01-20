package test.com.dao;

import static org.junit.Assert.*;
import main.com.entity.Superhero;
import main.com.entity.PersonEntity.Person;
import main.com.hibernateDao.PersonDao;
import main.com.hibernateDao.SuperHeroDAO;
import main.com.hibernateDao.SuperHeroDAOIfc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring/servlet-context.xml"})
@TransactionConfiguration(defaultRollback=true,transactionManager="transactionManager")
public class DaoTest {
    @Autowired
    private SuperHeroDAOIfc superDao;
   //SuperHeroDAO superDao;
    @Autowired
   private PersonDao personDao;
    
  @Before
  public void init(){
     System.out.println("Before test begins.");
  }
	@Test
	public void testSuperHeroId() {
		Superhero hero = new Superhero();
		hero = superDao.getSuperHeroDetails(hero);
		
		assertNotNull(hero);
	}
	
	@Test
	public void testGetEmployeeById() {
		Person person = new Person();
		person = personDao.getPersonById(101);
		
		assertNotNull(person);
	}
	
	@After
	public void post(){
	    System.out.println("After all test done.");
	}
	
}
