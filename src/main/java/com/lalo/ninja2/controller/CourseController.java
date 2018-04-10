package com.lalo.ninja2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lalo.ninja2.entity.Course;
import com.lalo.ninja2.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	private static final String COURSES_VIEW = "Courses";
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService;
	
	@GetMapping("/listCourse")
	public ModelAndView listAllCourses()
	{
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("courses", courseService.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute("course") Course course)
	{
		courseService.addCourse(course);
		return "redirect:/listCourse";
	}
}
