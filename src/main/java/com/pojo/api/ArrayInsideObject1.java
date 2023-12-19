package com.pojo.api;

import java.util.List;

public class ArrayInsideObject1 {
	private int id;
	private String name;
	private int age;
	private List<ArrayInsideObject2> city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<ArrayInsideObject2> getCity() {
		return city;
	}
	public void setCity(List<ArrayInsideObject2> city) {
		this.city = city;
	}
	

}
