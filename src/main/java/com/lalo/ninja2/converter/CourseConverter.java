package com.lalo.ninja2.converter;

import org.springframework.stereotype.Component;

import com.lalo.ninja2.entity.Course;
import com.lalo.ninja2.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {

	//Entity -->Model
	public CourseModel entity2Model(Course course)
	{
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		return courseModel;
	}
	
	//Model --> Entity 
	public Course model2entity (CourseModel courseModel)
	{
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		return course;
	}
}