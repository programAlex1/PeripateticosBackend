/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

/**
 *
 * @author MITCHEL
 */
import com.example.demo.model.Course;
import jakarta.transaction.Transactional;
import java.util.List;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer>
{    
    public Course findByCoursename(String coursename);
	
	public Course findByCourseid(String courseid);
	
	public List<Course> findByInstructorname(String instructorname);
	
	public List<Course> findByInstructorinstitution(String instructorinstitution);
	
    public List<Course> findByEnrolleddate(String enrolleddate);
	
	public List<Course> findByCoursetype(String coursetype);
	
	public List<Course> findByYoutubeurl(String youtubeurl);
	
	public List<Course> findByWebsiteurl(String websiteurl);
	
    public List<Course> findBySkilllevel(String skilllevel);
	
	public List<Course> findByLanguage(String language);
	
	@Transactional
	@Modifying
	@Query(value = "update course set enrolledcount = ?1 where coursename = ?2",nativeQuery = true)
	public void updateEnrolledcount(int enrolledcount, String coursename);
	
}