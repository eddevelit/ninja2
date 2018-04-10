package com.lalo.ninja2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lalo.ninja2.entity.Course;
import com.lalo.ninja2.repository.CourseJpaRepository;
import com.lalo.ninja2.service.CourseService;

public class CourseServiceImpl implements CourseService{
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseRepository;

	@Override
	public List<Course> listAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public int removeCourse(int id) {
		courseRepository.deleteById(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	
	
}
