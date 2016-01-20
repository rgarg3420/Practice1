package main.com.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import main.com.dtos.Customer;
import main.com.entity.Superhero;
import main.com.exception.CustomeException;
import main.com.hibernateDao.SuperHeroDAO;

@Controller
public class HomeController extends AbstractController{

	@RequestMapping(value="/home/{id}",method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response, @PathVariable(value="id") String id,
			@RequestParam(value="name",required=false) String name) throws Exception {
		
		ModelAndView model = new ModelAndView();

System.out.println("The home controller is called "+ id+" : name : "+name);

          HashMap<String,String> map = new HashMap<String,String>();
          map.put("id",id);
          map.put("name",name);
          
         if(id.equals("00")){
        	 throw new CustomeException("Error:0000","Custom Exception occured!");
         }
         
         SuperHeroDAO superheroDAO = new SuperHeroDAO();
         Superhero hero = new Superhero();
         hero = superheroDAO.getSuperHeroDetails(hero);
         
         System.out.println("Data in the controller for hero object is : "+hero.toString());
         map.put("superHeroName", hero.getHeroName());
         map.put("superHeroCity", hero.getAlias().getCity());
         map.put("alias", hero.getAlias().getAliasName());
       //  map.put("supervillian", hero.getSuperVillian().iterator().next().getVillianName());
        model.addAllObjects(map);
        model.addObject("customer",new Customer());
		model.setViewName("home");
		return model;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
