package com.rishab.interview.demo.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {
	
	private Integer noteId;
	private String note;
	private Integer userId;
	
	public Note() {}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="note_id")
	public Integer getNoteId() {
		return noteId;
	}
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}
	@Column(name="note",nullable=false)
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Column(name="user_id",nullable=false)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
