package com.internousdev.logintest.dto;

public class LoginDTO {
	private String username;
	private String password;
	private String email;
	private String address;
	private int tell;
	private int birthday;
	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username セットする username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return tell
	 */
	public int getTell() {
		return tell;
	}
	/**
	 * @param tell セットする tell
	 */
	public void setTell(int tell) {
		this.tell = tell;
	}
	/**
	 * @return birthday
	 */
	public int getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}



}
