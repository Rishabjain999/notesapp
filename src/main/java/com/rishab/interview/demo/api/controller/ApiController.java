package com.rishab.interview.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rishab.interview.demo.api.entity.Note;
import com.rishab.interview.demo.api.entity.Response;
import com.rishab.interview.demo.api.entity.User;
import com.rishab.interview.demo.api.repository.NoteDao;
import com.rishab.interview.demo.api.repository.UserDao;

@RestController
@RequestMapping("/app")
public class ApiController {

	
	@Autowired NoteDao noteDao;
	@Autowired UserDao userDao;
	
	@GetMapping("/testUser")
	public User sampleUser(){
		User user=new User();
		user.setUsername("");
		user.setPassword("");
		user.setUserId(0);
		return user;
	}
	
	@PostMapping("/user")
	public Response createUser(@RequestBody User user) {
		userDao.save(user);
		return new Response("account created");
	}
	
	@PostMapping("/user/auth")
	public Response userAuthr(@RequestBody User user) {
		User savedUser=userDao.findByUsername(user.getUsername());
		if(savedUser.getPassword().equals(user.getPassword())) {
			return new Response("Success",user.getUserId());
		}
		return new Response("Failed",user.getUserId());
	}
	
	@GetMapping("/sites/list")
	public List<Note> getUserNotes(@RequestParam int userId) {
		return noteDao.findByUserId(userId);
	}
	
	@PostMapping("/sites")
	public Response saveNotes(@RequestBody Note note,@RequestParam int userId) {
		note.setUserId(userId);
		noteDao.save(note);
		return new Response("Success");
	}
	
}
