package com.nodeTech.Assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
private int id;
	@Column(name="username")
private String userName;
	@Column(name="password")
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Login(int id, String userName, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
}
@Override
public String toString() {
	return "Login [id=" + id + ", userName=" + userName + ", password=" + password + "]";
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}

}
