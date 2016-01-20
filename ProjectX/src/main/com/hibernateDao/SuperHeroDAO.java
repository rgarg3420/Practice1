package main.com.hibernateDao;

import java.util.Date;
import java.util.HashSet;

import main.com.entity.SuperPowers;
import main.com.entity.SuperVillians;
import main.com.entity.Superhero;
import main.com.entity.SuperheroAlias;
import main.com.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class SuperHeroDAO implements InitializingBean, DisposableBean,SuperHeroDAOIfc{
    
 public Superhero getSuperHeroDetails(Superhero hero1){

	    Session session = HibernateUtil.getSessionFactory().openSession();
	      
		try{
	    System.out.println("Maven + Hibernate + Oracle");
		

		session.beginTransaction();
		
		
		System.out.println("fetching data  for super hero 1");
		 hero1 = (Superhero) session.get(Superhero.class, 130);
		Thread.sleep(5000);
		System.out.println("fetching data again for super hero 1");
		hero1 =(Superhero) session.get(Superhero.class, 130);
		Thread.sleep(5000);
		
		
		System.out.println("The data for hero 1 :"+ hero1.toString());
		
		
		
		//session.getTransaction().commit();
		
		
		}
		catch(HibernateException he){
		  he.printStackTrace();
		    session.getTransaction().rollback();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		return hero1;
	    
 }

public void createSuperHeroDetails(Superhero superHero) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    
	try{
System.out.println("Maven + Hibernate + Oracle");
	

	session.beginTransaction();
	
	Superhero superHero1 = new Superhero();
	
	
	SuperheroAlias superHeroAlias1 = new SuperheroAlias();
	
	
	SuperVillians superVillian1 = new SuperVillians();
	SuperVillians superVillian2 = new SuperVillians();
	
	
	SuperPowers superpower1 = new SuperPowers();
	SuperPowers superpower2 = new SuperPowers();
	
	
	
	superHero1.setHeroName(superHero.getHeroName());
	superHero1.setComic(superHero.getComic());
	superHero1.setCreatedBy(superHero.getCreatedBy());
	superHero1.setCreatedDate(new Date("01/07/1933"));
	
	HashSet<Superhero>heroSet = new HashSet<Superhero>();
	heroSet.add(superHero1);
	
	superHeroAlias1.setAliasName("Clark Kent");
	superHeroAlias1.setJob("Reporter");
	superHeroAlias1.setCity("Metropolis");
	
	superHeroAlias1.setSuperHero(superHero1);
	
	superHero1.setAlias(superHeroAlias1);
	
	superVillian1.setVillianName("Lex Luthor");
	superVillian1.setVillianType("Human");
	superVillian1.setTerritory("Earth");
	superVillian1.setSuperhero(superHero1);
	
	superVillian2.setVillianName("General Zod");
	superVillian2.setVillianType("Krypton-Alien");
	superVillian2.setTerritory("Earth and Krypton");
	superVillian2.setSuperhero(superHero1);
	
	HashSet<SuperVillians> set = new HashSet<SuperVillians>();
	set.add(superVillian1);
	set.add(superVillian2);
	
    superpower1.setPowerName("FlyHigh");
    superpower1.setDescription("fly into space");
    superpower1.setAbility("fly into space without suit.");
    
    
    superpower2.setPowerName("Laser Beam");
    superpower2.setDescription("Laser beam to cut through, burn, melt things");
    superpower2.setAbility("Eye Laser");
    
    
  
    
    
    HashSet<SuperPowers> setPower = new HashSet<SuperPowers>();
    ;
    setPower.add(superpower2);
    setPower.add(superpower1);
	
	superHero1.setSuperVillian(set);
	superHero1.setSuperpowers(setPower);
	
	session.save(superHero1);
	session.getTransaction().commit();
	}
	catch(HibernateException he){
	  he.printStackTrace();
	    session.getTransaction().rollback();
	}
	

   
}
 
public void initialize(){
    System.out.println("Initializing SUPERHERODAO CLASS.");
}

public void finish(){
    System.out.println("Destroying SUPERHERODAO CLASS");
}

@Override
public void afterPropertiesSet() throws Exception {
   System.out.println("Afterset property called for superherodao");
    
}

@Override
public void destroy() throws Exception {
    System.out.println("Destroy method for disposing bean superherodao");
    
}


 



}
