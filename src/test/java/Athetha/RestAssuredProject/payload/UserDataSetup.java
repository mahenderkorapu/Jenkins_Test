package Athetha.RestAssuredProject.payload;


public class UserDataSetup {

	private Integer userId;
	private String  userName;
	private String  firstName;
	private String  lastName;
	private String  email;
	private String  password;
	private String  phone;

	public Integer getUserid()
	{
		return userId;
	}
	public void setUserid(Integer userId)
	{
		this.userId= userId;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName= userName;
	}	
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName= firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName= lastName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone= phone;
	}
	
}
