package main.com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@Entity
@FilterDef(name="comicFlter",parameters= @ParamDef(name="comicParam", type="String"))
@Table(name = "SUPERHERO")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="superhero")

public class Superhero implements Serializable {

    private static final long serialVersionUID = 6388595322297358485L;

    private int heroId;
    private String heroName;
    private String comic;
    private String createdBy;
    private Date createdDate;
    private SuperheroAlias alias;
    private Set<SuperVillians> superVillian;
    private Set<SuperPowers> superpowers;

    public Superhero() {

    }

    public Superhero(int heroId, String heroName, String comic,
	    String createdBy, Date createdDate, SuperheroAlias alias,
	    Set<SuperVillians> superVillian, Set<SuperPowers> superPowers) {
	super();
	this.heroId = heroId;
	this.heroName = heroName;
	this.comic = comic;
	this.createdBy = createdBy;
	this.createdDate = createdDate;
	this.alias = alias;
	this.superVillian = superVillian;
	this.superpowers = superPowers;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hero_seq")
    @SequenceGenerator(name = "hero_seq", sequenceName = "hero_seq", allocationSize = 1)
    @Column(name = "HERO_ID", nullable = false, unique = true, length = 10)
    public int getHeroId() {
	return heroId;
    }

    public void setHeroId(int heroId) {
	this.heroId = heroId;
    }

    @Column(name = "HERO_NAME", nullable = false, unique = true, length = 30)
    public String getHeroName() {
	return heroName;
    }

    public void setHeroName(String heroName) {
	this.heroName = heroName;
    }

    @Column(name = "COMIC", nullable = true, unique = false, length = 20)
    @Filter(name = "comicFlter", condition="comic = :comicParam")
    public String getComic() {
	return comic;
    }

    public void setComic(String comic) {
	this.comic = comic;
    }

    @Column(name = "CREATED_BY", nullable = false, unique = false, length = 30)
    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE", nullable = true)
    public Date getCreatedDate() {
	return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "superHero")
    @Fetch(FetchMode.JOIN)
    public SuperheroAlias getAlias() {
	return alias;
    }

    public void setAlias(SuperheroAlias alias) {
	this.alias = alias;
    }

    @OneToMany(mappedBy = "superhero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    public Set<SuperVillians> getSuperVillian() {
	return superVillian;
    }

    public void setSuperVillian(Set<SuperVillians> superVillian) {
	this.superVillian = superVillian;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "SUPER_HERO_POWER", schema = "SYSTEM", 
    joinColumns = { @JoinColumn(name = "HERO_ID", nullable = false, updatable = true) }, 
    inverseJoinColumns = { @JoinColumn(name = "POWER_ID", nullable = false, updatable = true) })
    public Set<SuperPowers> getSuperpowers() {
	return superpowers;
    }

    public void setSuperpowers(Set<SuperPowers> superpowers) {
	this.superpowers = superpowers;
    }

    @Override
    public String toString() {
	return "Superhero [heroId=" + heroId + ", heroName=" + heroName
		+ ", comic=" + comic + ", createdBy=" + createdBy
		+ ", createdDate=" + createdDate + ", alias=" + alias
		+ ", superVillian=" + superVillian + ", superpowers="
		+ superpowers + "]";
    }
    
    

}
