package com.rishab.interview.demo.api.entity;

public class Response {

	private String status;
	private Integer userId;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Response(String status) {
		super();
		this.status = status;
	}
	
	public Response(String status, Integer userId) {
		super();
		this.status = status;
		this.userId = userId;
	}
	
	public Response(Integer userId) {
		super();
		this.userId = userId;
	}
	
}
