package com.lalo.ninja2.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lalo.ninja2.entity.Course;

@Repository("courseJpaRepository")
public interface CourseJpaRepository extends JpaRepository<Course, Serializable> {

	public abstract Course findByPrice(int price);

	public abstract Course findByPriceAndName(int price, int name);

	public abstract List<Course> findByNameOrderByHours(String name);

	public abstract Course findByNameOrPrice(String name, int price);

}
