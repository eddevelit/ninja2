package com.lalo.ninja2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lalo.ninja2.repository.CourseJpaRepository;

@Component("courseComponent")
public class CourseComponent {

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseRpository;
	
	
	
}
