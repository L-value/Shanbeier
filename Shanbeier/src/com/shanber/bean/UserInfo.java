package com.shanber.bean;

import java.io.Serializable;

/**
 * @author ctt:
 * @version ����ʱ�䣺2016��5��2�� 
 * ��˵��
 */
public class UserInfo implements Serializable{
//	username         string         �û���¼��
//	nickanme         string         �û��ǳ�
//	id               int            �û�id
//	avatar           string         �û�ͷ��
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
