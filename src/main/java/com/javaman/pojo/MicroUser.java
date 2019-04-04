package com.javaman.pojo;

public class MicroUser {
	private int id;
	private String name;
	private String password;
	private int gender;
	private int age;
	private String tel;
	private String identity;
	private float account;
	private String info;
	
	
	public MicroUser() {
	}
	public MicroUser(int id, String name, String password, int gender, int age, String tel, String identity,
			float account, String info) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.identity = identity;
		this.account = account;
		this.info = info;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public float getAccount() {
		return account;
	}
	public void setAccount(float account) {
		this.account = account;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "MicroUser [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", age="
				+ age + ", tel=" + tel + ", identity=" + identity + ", account=" + account + ", info=" + info + "]";
	}
}
