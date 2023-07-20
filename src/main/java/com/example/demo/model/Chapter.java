/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Chapter {
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String coursename;
	private String chapter1name;
	private String chapter1id;
	private String chapter2name;
	private String chapter2id;
	private String chapter3name;
	private String chapter3id;
	private String chapter4name;
	private String chapter4id;
	private String chapter5name;
	private String chapter5id;
	private String chapter6name;
	private String chapter6id;
	private String chapter7name;
	private String chapter7id;
	private String chapter8name;
	private String chapter8id;
    
    private String challenge1name;
	private String challenge1id;
    private String challenge1description;
    private String challenge1code;
    private String challenge1origin;
    private String challenge1response;
    private String challenge2name;
	private String challenge2id;
    private String challenge2description;
    private String challenge2response;
    private String challenge2code;
    private String challenge2origin;
    private String challenge3name;
	private String challenge3id;
    private String challenge3description;
    private String challenge3response;
    private String challenge3code;
    private String challenge3origin;
	
	public Chapter() 
	{
		super();
	}

  public Chapter(int id, String coursename, String chapter1name, String chapter1id, String chapter2name, String chapter2id, String chapter3name, String chapter3id, String chapter4name, String chapter4id, String chapter5name, String chapter5id, String chapter6name, String chapter6id, String chapter7name, String chapter7id, String chapter8name, String chapter8id, String challenge1name, String challenge1id, String challenge1description, String challenge1code, String challenge1origin, String challenge1response, String challenge2name, String challenge2id, String challenge2description, String challenge2response, String challenge2code, String challenge2origin, String challenge3name, String challenge3id, String challenge3description, String challenge3response, String challenge3code, String challenge3origin) {
    this.id = id;
    this.coursename = coursename;
    this.chapter1name = chapter1name;
    this.chapter1id = chapter1id;
    this.chapter2name = chapter2name;
    this.chapter2id = chapter2id;
    this.chapter3name = chapter3name;
    this.chapter3id = chapter3id;
    this.chapter4name = chapter4name;
    this.chapter4id = chapter4id;
    this.chapter5name = chapter5name;
    this.chapter5id = chapter5id;
    this.chapter6name = chapter6name;
    this.chapter6id = chapter6id;
    this.chapter7name = chapter7name;
    this.chapter7id = chapter7id;
    this.chapter8name = chapter8name;
    this.chapter8id = chapter8id;
    this.challenge1name = challenge1name;
    this.challenge1id = challenge1id;
    this.challenge1description = challenge1description;
    this.challenge1code = challenge1code;
    this.challenge1origin = challenge1origin;
    this.challenge1response = challenge1response;
    this.challenge2name = challenge2name;
    this.challenge2id = challenge2id;
    this.challenge2description = challenge2description;
    this.challenge2response = challenge2response;
    this.challenge2code = challenge2code;
    this.challenge2origin = challenge2origin;
    this.challenge3name = challenge3name;
    this.challenge3id = challenge3id;
    this.challenge3description = challenge3description;
    this.challenge3response = challenge3response;
    this.challenge3code = challenge3code;
    this.challenge3origin = challenge3origin;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCoursename() {
    return coursename;
  }

  public void setCoursename(String coursename) {
    this.coursename = coursename;
  }

  public String getChapter1name() {
    return chapter1name;
  }

  public void setChapter1name(String chapter1name) {
    this.chapter1name = chapter1name;
  }

  public String getChapter1id() {
    return chapter1id;
  }

  public void setChapter1id(String chapter1id) {
    this.chapter1id = chapter1id;
  }

  public String getChapter2name() {
    return chapter2name;
  }

  public void setChapter2name(String chapter2name) {
    this.chapter2name = chapter2name;
  }

  public String getChapter2id() {
    return chapter2id;
  }

  public void setChapter2id(String chapter2id) {
    this.chapter2id = chapter2id;
  }

  public String getChapter3name() {
    return chapter3name;
  }

  public void setChapter3name(String chapter3name) {
    this.chapter3name = chapter3name;
  }

  public String getChapter3id() {
    return chapter3id;
  }

  public void setChapter3id(String chapter3id) {
    this.chapter3id = chapter3id;
  }

  public String getChapter4name() {
    return chapter4name;
  }

  public void setChapter4name(String chapter4name) {
    this.chapter4name = chapter4name;
  }

  public String getChapter4id() {
    return chapter4id;
  }

  public void setChapter4id(String chapter4id) {
    this.chapter4id = chapter4id;
  }

  public String getChapter5name() {
    return chapter5name;
  }

  public void setChapter5name(String chapter5name) {
    this.chapter5name = chapter5name;
  }

  public String getChapter5id() {
    return chapter5id;
  }

  public void setChapter5id(String chapter5id) {
    this.chapter5id = chapter5id;
  }

  public String getChapter6name() {
    return chapter6name;
  }

  public void setChapter6name(String chapter6name) {
    this.chapter6name = chapter6name;
  }

  public String getChapter6id() {
    return chapter6id;
  }

  public void setChapter6id(String chapter6id) {
    this.chapter6id = chapter6id;
  }

  public String getChapter7name() {
    return chapter7name;
  }

  public void setChapter7name(String chapter7name) {
    this.chapter7name = chapter7name;
  }

  public String getChapter7id() {
    return chapter7id;
  }

  public void setChapter7id(String chapter7id) {
    this.chapter7id = chapter7id;
  }

  public String getChapter8name() {
    return chapter8name;
  }

  public void setChapter8name(String chapter8name) {
    this.chapter8name = chapter8name;
  }

  public String getChapter8id() {
    return chapter8id;
  }

  public void setChapter8id(String chapter8id) {
    this.chapter8id = chapter8id;
  }

  public String getChallenge1name() {
    return challenge1name;
  }

  public void setChallenge1name(String challenge1name) {
    this.challenge1name = challenge1name;
  }

  public String getChallenge1id() {
    return challenge1id;
  }

  public void setChallenge1id(String challenge1id) {
    this.challenge1id = challenge1id;
  }

  public String getChallenge1description() {
    return challenge1description;
  }

  public void setChallenge1description(String challenge1description) {
    this.challenge1description = challenge1description;
  }

  public String getChallenge1code() {
    return challenge1code;
  }

  public void setChallenge1code(String challenge1code) {
    this.challenge1code = challenge1code;
  }

  public String getChallenge1origin() {
    return challenge1origin;
  }

  public void setChallenge1origin(String challenge1origin) {
    this.challenge1origin = challenge1origin;
  }

  public String getChallenge1response() {
    return challenge1response;
  }

  public void setChallenge1response(String challenge1response) {
    this.challenge1response = challenge1response;
  }

  public String getChallenge2name() {
    return challenge2name;
  }

  public void setChallenge2name(String challenge2name) {
    this.challenge2name = challenge2name;
  }

  public String getChallenge2id() {
    return challenge2id;
  }

  public void setChallenge2id(String challenge2id) {
    this.challenge2id = challenge2id;
  }

  public String getChallenge2description() {
    return challenge2description;
  }

  public void setChallenge2description(String challenge2description) {
    this.challenge2description = challenge2description;
  }

  public String getChallenge2response() {
    return challenge2response;
  }

  public void setChallenge2response(String challenge2response) {
    this.challenge2response = challenge2response;
  }

  public String getChallenge2code() {
    return challenge2code;
  }

  public void setChallenge2code(String challenge2code) {
    this.challenge2code = challenge2code;
  }

  public String getChallenge2origin() {
    return challenge2origin;
  }

  public void setChallenge2origin(String challenge2origin) {
    this.challenge2origin = challenge2origin;
  }

  public String getChallenge3name() {
    return challenge3name;
  }

  public void setChallenge3name(String challenge3name) {
    this.challenge3name = challenge3name;
  }

  public String getChallenge3id() {
    return challenge3id;
  }

  public void setChallenge3id(String challenge3id) {
    this.challenge3id = challenge3id;
  }

  public String getChallenge3description() {
    return challenge3description;
  }

  public void setChallenge3description(String challenge3description) {
    this.challenge3description = challenge3description;
  }

  public String getChallenge3response() {
    return challenge3response;
  }

  public void setChallenge3response(String challenge3response) {
    this.challenge3response = challenge3response;
  }

  public String getChallenge3code() {
    return challenge3code;
  }

  public void setChallenge3code(String challenge3code) {
    this.challenge3code = challenge3code;
  }

  public String getChallenge3origin() {
    return challenge3origin;
  }

  public void setChallenge3origin(String challenge3origin) {
    this.challenge3origin = challenge3origin;
  }



}
