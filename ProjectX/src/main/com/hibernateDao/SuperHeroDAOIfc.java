package main.com.hibernateDao;

import main.com.entity.Superhero;

public interface SuperHeroDAOIfc {

    public Superhero getSuperHeroDetails(Superhero hero1);
    public void createSuperHeroDetails(Superhero superHero) ;
    
}
