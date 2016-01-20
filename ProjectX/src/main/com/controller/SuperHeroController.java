package main.com.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.com.dtos.Customer;
import main.com.entity.Superhero;
import main.com.hibernateDao.SuperHeroDAO;
import main.com.hibernateDao.SuperHeroDAOIfc;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SuperHeroController {
    
   @Autowired
   @Qualifier("superHeroValidator")
  private Validator validator;
   
   @Autowired
   private SuperHeroDAOIfc superheroDAO;
   
   @InitBinder
   private void InitBinder(WebDataBinder binder){
       binder.setValidator(validator);
   }

	@RequestMapping(value = "/HeroPage", method = RequestMethod.GET)
	public ModelAndView normalHome(Locale locale) {
		System.out.println("Welcome Hero page! The client locale is {}."
				+ locale);
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("superHero", new Superhero());
		modelView.setViewName("HeroPage");
		return modelView;
	}
   
   
   @RequestMapping(value = "/heroData", method = RequestMethod.POST)
   public ModelAndView setHeroData(HttpServletRequest request , HttpServletResponse response, 
   @ModelAttribute (value="superHero") @Validated Superhero superHero,BindingResult bindingResult) throws Exception{
       
       ModelAndView model = new ModelAndView();
       
       System.out.println("Name:" + superHero.getHeroName() + " Comic: "
		+ superHero.getComic()+ "Created by :"+superHero.getCreatedBy());
      if(bindingResult.hasErrors()){
	  System.out.println("ERROR OCCURED!!!!!!!!!!!");
	  model.setViewName("HeroPage");
	  return model;
      }
     // SuperHeroDAO superheroDAO = new SuperHeroDAO();
    
      superheroDAO.createSuperHeroDetails(superHero);
      
     ModelMap map = new ModelMap();
     map.addAttribute("hero", superHero);
     
     superheroDAO.getSuperHeroDetails(superHero);
      model.addObject(map);
      model.setViewName("HeroPage");
    return model;
       
   }
   
   @RequestMapping(value="/hero" ,method= RequestMethod.GET)
   public String getHeroHTML(HttpServletRequest request, HttpServletResponse response){
       
      System.out.println("The HTML Page SUPER HERO CALLED!!!"); 
       return "redirect:/static/SuperHero.html";
   }
   
   
   
}
