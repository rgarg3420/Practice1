package main.com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="SUPER_POWER")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="superhero")
public class SuperPowers implements Serializable{

 private static final long serialVersionUID = -6322450178345292930L;
 
 private int powerId;
 private String powerName;
 private String description;
 private String ability;
 private Set<Superhero> superhero = new HashSet<Superhero>();
 
public SuperPowers() {
    super();
}


public SuperPowers(int powerId, String powerName, String description,
	String ability, Set<Superhero> superhero) {
    super();
    this.powerId = powerId;
    this.powerName = powerName;
    this.description = description;
    this.ability = ability;
    this.superhero = superhero;
}

@Id
@Column(name="POWER_ID", nullable=false, unique=true, length=10)
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="power_seq")
@SequenceGenerator(name="power_seq", sequenceName="hero_seq",allocationSize=3)
public int getPowerId() {
    return powerId;
}


public void setPowerId(int powerId) {
    this.powerId = powerId;
}

@Column(name="POWER_NAME", length=20)
public String getPowerName() {
    return powerName;
}


public void setPowerName(String powerName) {
    this.powerName = powerName;
}

@Column(name="DESCRIPTION", length=100)
public String getDescription() {
    return description;
}


public void setDescription(String description) {
    this.description = description;
}

@Column(name="ABILITY", length=100)
public String getAbility() {
    return ability;
}


public void setAbility(String ability) {
    this.ability = ability;
}

@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
public Set<Superhero> getSuperhero() {
    return superhero;
}


public void setSuperhero(Set<Superhero> superhero) {
    this.superhero = superhero;
}


}
