package com.example.demo.entity;

public class Course {
	
	private int id;
	private String name;
	private String desctiption;
	
	public Course(int id, String name, String desctiption) {
		super();
		this.id = id;
		this.name = name;
		this.desctiption = desctiption;
	}
	
	public int getId() {
		return id;
	}
   
	public String getName() {
		return name;
	}

   public String getDesctiption() {
		return desctiption;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", desctiption=" + desctiption + "]";
	}
	
	
	

}
