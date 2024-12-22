package com.sprintbootproject.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintbootproject.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	
}