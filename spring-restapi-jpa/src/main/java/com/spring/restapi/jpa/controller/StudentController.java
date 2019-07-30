package com.spring.restapi.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.restapi.jpa.dao.StudentRepository;
import com.spring.restapi.jpa.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentRepository studentRepo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/add")
	public String addStudent(Student student)
	{
		studentRepo.save(student);
		return "home.jsp";
		
	}
	@RequestMapping("/get")
	public ModelAndView getStudent(@RequestParam int sid)
	{
		ModelAndView mav=new ModelAndView("display.jsp");
				Student s=studentRepo.findById(sid).orElse(new Student());
				mav.addObject(s);
				return mav;
		
	}

}
