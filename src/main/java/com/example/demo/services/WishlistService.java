/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.model.Wishlist;
import com.example.demo.repository.WishlistRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class WishlistService {
  @Autowired
	private WishlistRepository wishlistRepo;
	
	public Wishlist saveToWishlist(Wishlist course)
	{
		return wishlistRepo.save(course);
	}
	
	public Wishlist addToWishlist(Wishlist course)
	{
		return wishlistRepo.save(course);
	}
	
	public List<Wishlist> getAllLikedCourses()
	{
		return (List<Wishlist>)wishlistRepo.findAll();
	}
	
	public Wishlist fetchCourseByCoursename(String coursename)
	{
		return wishlistRepo.findByCoursename(coursename);
	}
	
	public Wishlist fetchCourseByCourseid(String courseid)
	{
		return wishlistRepo.findByCourseid(courseid);
	}
	
	public List<Wishlist> fetchByInstructorname(String instructorname)
	{
		return (List<Wishlist>)wishlistRepo.findByInstructorname(instructorname);
	}
	
	public List<Wishlist> fetchByInstructorinstitution(String instructorinstitution)
	{
		return (List<Wishlist>)wishlistRepo.findByInstructorinstitution(instructorinstitution);
	}
	
	public List<Wishlist> fetchByLikeduser(String likeduser)
	{
		return (List<Wishlist>)wishlistRepo.findByLikeduser(likeduser);
	}
	
	public List<Wishlist> fetchByLikedusertype(String likedusertype)
	{
		return (List<Wishlist>)wishlistRepo.findByLikedusertype(likedusertype);
	}
	
	public List<Wishlist> fetchByCoursetype(String coursetype)
	{
		return (List<Wishlist>)wishlistRepo.findByCoursetype(coursetype);
	}
	
	public List<Wishlist> fetchBySkilllevel(String skilllevel)
	{
		return (List<Wishlist>)wishlistRepo.findBySkilllevel(skilllevel);
	}
	
	public List<Wishlist> fetchByLanguage(String language)
	{
		return (List<Wishlist>)wishlistRepo.findByLanguage(language);
	}
	
}
