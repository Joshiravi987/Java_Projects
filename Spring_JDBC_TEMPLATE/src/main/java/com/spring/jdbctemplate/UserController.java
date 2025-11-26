package com.spring.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user,HttpSession session) {
		userService.register(user);
		//add data inserted message
		session.setAttribute("message", "User registered successfully");
		return "register";
	}
	
	@RequestMapping(value = "/showdata", method = RequestMethod.GET)//show all users
	public ModelAndView showUsers(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("showUsers");//method name to be called
		mav.addObject("users", userService.getAllUsers());
		return mav;
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)//delete user by id
	public String deleteUser(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		int id = Integer.parseInt(request.getParameter("id"));
		userService.delete(id);
		//add data deleted message
		session.setAttribute("message", "User deleted successfully");
		return "redirect:/showdata";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)//edit user by id
	public ModelAndView editUser(@RequestParam("id") int id) {
	ModelAndView mav = new ModelAndView("editUser");
		mav.addObject("editdata", userService.getUserById(id));
		return mav;
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)//update user by id
	public String updateUser(@ModelAttribute User user,HttpSession session) {
		userService.update(user);
		//add data updated message
		session.setAttribute("message", "User updated successfully");
		return "redirect:/showdata";
	}
}
