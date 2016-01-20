package main.com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="SUPERHERO_ALIAS",schema="SYSTEM")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="superhero")
public class SuperheroAlias implements Serializable {

    private static final long serialVersionUID = -1337637740476372459L;

private int  heroAliasId; 
private String aliasName;
private String job;
private String city;
//private int heroId;
private Superhero superHero;



public SuperheroAlias() {
    super();
}



public SuperheroAlias(int heroAliasId, String aliasName, String job,
	String city, Superhero superHero) {
    super();
    this.heroAliasId = heroAliasId;
    this.aliasName = aliasName;
    this.job = job;
    this.city = city;
    //this.heroId = heroId;
    this.superHero = superHero;
}


@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="alias_seq")
@SequenceGenerator(name = "alias_seq", sequenceName = "hero_seq", allocationSize = 2)
@Column(name="HERO_ALIAS_ID", nullable=false, unique=true, length=10 )
public int getHeroAliasId() {
    return heroAliasId;
}



public void setHeroAliasId(int heroAliasId) {
    this.heroAliasId = heroAliasId;
}


@Column(name="ALIAS_NAME", length=30 , nullable=true)
public String getAliasName() {
    return aliasName;
}



public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
}


@Column(name="ALIAS_PROFESSION", length=30 , nullable=true)
public String getJob() {
    return job;
}



public void setJob(String job) {
    this.job = job;
}


@Column(name="CITY", length=20 , nullable=true)
public String getCity() {
    return city;
}



public void setCity(String city) {
    this.city = city;
}


/*@GenericGenerator(name = "generator", strategy = "foreign", 
parameters = @Parameter(name = "property", value = "superHero"))
@GeneratedValue(generator = "generator")
@Column(name = "HERO_ID", unique = true, nullable = false)
public int getHeroId() {
    return heroId;
}



public void setHeroId(int heroId) {
    this.heroId = heroId;
}*/


@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
@JoinColumn(name = "HERO_ID")
public Superhero getSuperHero() {
    return superHero;
}



public void setSuperHero(Superhero superHero) {
    this.superHero = superHero;
}


    
}
