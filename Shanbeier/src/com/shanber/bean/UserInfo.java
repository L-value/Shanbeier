package com.shanber.bean;

import java.io.Serializable;

/**
 * @author ctt:
 * @version 创建时间：2016年5月2日 
 * 类说明
 */
public class UserInfo implements Serializable{
//	username         string         用户登录名
//	nickanme         string         用户昵称
//	id               int            用户id
//	avatar           string         用户头像
	private String username;
	private String nickname;
	private String id;
	private String avatar;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String username, String nickname, String id, String avatar) {
		super();
		this.setUsername(username);
		this.setNickname(nickname);
		this.setId(id);
		this.setAvatar(avatar);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", nickname=" + nickname
				+ ", id=" + id + ", avatar=" + avatar + "]";
	}
	
}
