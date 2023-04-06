package dto;

public class UserDto {
	//name email pwd
	private int user_id;
	private String name;
	private String email;
	private String pwd;
	

	public int getUser_id() {
		return user_id;
	}


	public UserDto() {
		super();
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public UserDto(int user_id, String name, String email, String pwd) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}


	public UserDto(String name, String email, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}


	public UserDto(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}



	
	
}
