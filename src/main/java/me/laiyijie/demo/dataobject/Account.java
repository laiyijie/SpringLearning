package me.laiyijie.demo.dataobject;

public class Account {
	private String username;
	private String password;
	private Long lastLoginTime;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", lastLoginTime=" + lastLoginTime + "]";
	}
}
