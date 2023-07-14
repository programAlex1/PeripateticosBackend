/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

/**
 *
 * @author MITCHEL
 */
import com.example.demo.model.Enrollment;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer>
{
    public Enrollment findByCoursename(String coursename);
	
	public Enrollment findByCourseid(String courseid);
	
    public List<Enrollment> findByEnrolledusername(String enrolledusername);
	
	public List<Enrollment> findByEnrolleduserid(String enrolleduserid);
	
	public List<Enrollment> findByEnrolledusertype(String enrolledusertype);
	
	public List<Enrollment> findByInstructorname(String instructorname);
	
	public List<Enrollment> findByInstructorinstitution(String instructorinstitution);
	
    public List<Enrollment> findByEnrolleddate(String enrolleddate);
	
	public List<Enrollment> findByCoursetype(String coursetype);
	
	public List<Enrollment> findByYoutubeurl(String youtubeurl);
	
	public List<Enrollment> findByWebsiteurl(String websiteurl);
	
    public List<Enrollment> findBySkilllevel(String skilllevel);
	
	public List<Enrollment> findByLanguage(String language);
	
	@Transactional
	@Modifying
	@Query(value = "update enrollment set enrolledcount = ?1 where coursename = ?2",nativeQuery = true)
	public void updateEnrolledcount(int enrolledcount, String coursename);

}
