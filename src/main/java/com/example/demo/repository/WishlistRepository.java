/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

/**
 *
 * @author MITCHEL
 */
import com.example.demo.model.Wishlist;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface WishlistRepository extends CrudRepository<Wishlist, Integer>
{
    public Wishlist findByCoursename(String coursename);
	
	public Wishlist findByCourseid(String courseid);
	
	public List<Wishlist> findByLikedusertype(String likedusertype);
	
	public List<Wishlist> findByLikeduser(String likeduser);
	
	public List<Wishlist> findByInstructorname(String instructorname);
	
	public List<Wishlist> findByInstructorinstitution(String instructorinstitution);
	
	public List<Wishlist> findByCoursetype(String coursetype);
	
    public List<Wishlist> findBySkilllevel(String skilllevel);
	
	public List<Wishlist> findByLanguage(String language);
}
