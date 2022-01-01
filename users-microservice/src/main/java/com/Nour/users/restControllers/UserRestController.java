package com.Nour.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Nour.users.entities.User;
import com.Nour.users.repos.UserRepository;

@RestController
@CrossOrigin(origins = "*") //toute source est permise(*) 
public class UserRestController {
	@Autowired
	UserRepository userRep;

	@RequestMapping(path = "all", method = RequestMethod.GET)
	//return liste des utilisateurs
	public List<User> getAllUsers() {
		return userRep.findAll();
	}
}