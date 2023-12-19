package com.pojo.api;

public class NestedObject1 {
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NestedObject2 getAdress() {
		return adress;
	}
	public void setAdress(NestedObject2 adress) {
		this.adress = adress;
	}
	private NestedObject2 adress;
	

}
