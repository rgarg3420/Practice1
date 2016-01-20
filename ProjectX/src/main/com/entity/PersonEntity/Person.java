package main.com.entity.PersonEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="RG_PERSON")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person implements Serializable{

private static final long serialVersionUID = 1370661759561663259L;

private int personID;
private String firstName;
private String lastName;
private int age;
private String type;

public Person() {
    super();
}

public Person(int personID, String firstName, String lastName, int age,
	String type) {
    super();
    this.personID = personID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.type = type;
}

@Id
@Column(name="PERSON_ID", nullable=false, unique=true,length=10 )
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="person_seq")
@SequenceGenerator(name="person_seq", sequenceName="user_seq", allocationSize=2)
public int getPersonID() {
    return personID;
}

public void setPersonID(int personID) {
    this.personID = personID;
}

@Column(name="FIRST_NAME", nullable = false, unique= false)
public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

@Column(name="LAST_NAME", nullable=true)
public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

@Column(name="AGE")
public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

@Column(name="TYPE")
public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}


    
    
}
