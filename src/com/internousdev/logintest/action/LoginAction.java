package com.internousdev.logintest.action;



import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.logintest.dao.LoginDAO;
import com.internousdev.logintest.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private Map<String,Object> session;
	public String execute(){
		String ret=ERROR;
		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();
		dto=dao.select(username,password);

			if(username.equals(dto.getUsername())){
				if(password.equals(dto.getPassword())){
					session.put("username",dto.getUsername());
					System.out.println((String)session.get("username"));
					session.put("password","123");
					System.out.println((String)session.get(dto.getPassword()));
					ret=SUCCESS;
				}
			}
		return ret;
	}


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

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}


}
