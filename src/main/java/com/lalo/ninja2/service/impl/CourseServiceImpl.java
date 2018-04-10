package com.lalo.ninja2.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.lalo.ninja2.entity.Course;
import com.lalo.ninja2.repository.CourseJpaRepository;
import com.lalo.ninja2.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService{
	
	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseRepository;

	@Override
	public List<Course> listAllCourses() {
		LOG.info("Call: listAllCourses()");
		return courseRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("Call: addCourse");
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
