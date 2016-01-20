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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="SUPER_VILLIAN")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="superhero")
public class SuperVillians implements Serializable{

    private static final long serialVersionUID = -1948206817173477819L;

    private int vId;
    private String villianName;
    private String villianType;
    private String territory;
    private Superhero superhero;
    
    
    public SuperVillians() {
	super();
    }


    public SuperVillians(int vId, String villianName, String villianType,
	    String territory, Superhero superhero) {
	super();
	this.vId = vId;
	this.villianName = villianName;
	this.villianType = villianType;
	this.territory = territory;
	this.superhero = superhero;
    }

@Id
@Column(name="VILLIAN_ID",length=10, unique=true, nullable=false)
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vil_seq")
@SequenceGenerator(name="vil_seq",sequenceName="hero_seq", allocationSize=3)
    public int getvId() {
        return vId;
    }


    public void setvId(int vId) {
        this.vId = vId;
    }

@Column(name="VILLIAN_NAME",length=30, nullable=false, unique=true)
    public String getVillianName() {
        return villianName;
    }


    public void setVillianName(String villianName) {
        this.villianName = villianName;
    }

@Column(name="TYPE")
    public String getVillianType() {
        return villianType;
    }


    public void setVillianType(String villianType) {
        this.villianType = villianType;
    }

@Column(name="TERRITORY")
    public String getTerritory() {
        return territory;
    }


    public void setTerritory(String territory) {
        this.territory = territory;
    }

@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@JoinColumn(name="HERO_ID")
    public Superhero getSuperhero() {
        return superhero;
    }


    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }
    
}
