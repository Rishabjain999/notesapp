package com.rishab.interview.demo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rishab.interview.demo.api.entity.Note;

@Repository
public interface NoteDao extends JpaRepository<Note, Integer>{

	List<Note> findByUserId(Integer userId);
	
}
