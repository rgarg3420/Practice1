package main.com.validator;

import main.com.entity.Superhero;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SuperHeroValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
	if(clazz.equals(Superhero.class)){
	    return true;
	}
	return false;
    }

    @Override
    public void validate(Object superHero, Errors error) {
	System.out.println("Validation called here++++++++++++++++++");
	ValidationUtils.rejectIfEmpty(error, "heroName", "heroName.required");
	ValidationUtils.rejectIfEmpty(error, "comic", "comic.required");
	ValidationUtils.rejectIfEmpty(error, "createdBy", "createdBy.required");
	
	Superhero sHero = (Superhero)superHero;
	
	if(sHero.getComic().length()<=2){
	    error.rejectValue("comic", "1001", null, "This is not a comic name.");
	}
    }

}
