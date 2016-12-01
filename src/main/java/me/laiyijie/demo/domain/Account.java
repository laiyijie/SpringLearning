package me.laiyijie.demo.domain;

public class Account {
    private String username;

    private String password;

    private String name;

    private Long create_time;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", name=" + name + ", create_time="
				+ create_time + "]";
	}
    
}