package Athetha.RestAssuredProject.endpoints;

public class Routes {
		
	public static String base_uri  ="https://petstore.swagger.io/v2";//base uri is the resource where all the services are running
	
	public static String post_uri = "/user"; //this post_uri route the request to a service to create user 
	public static String get_uri = "/user/{username}";//This get_uri route to a request to a read user by username
	public static String put_uri = "/user/{username}";//This put_uri route to a request to a update user by username
	public static String delete_uri = "/user/{username}";//This delete_uri route to a request to a delete user by username
	
	public static String get_login_uri = "/user/login?username={username}&password={password}";//This is get route to a request to a read details login
	public static String get_logout_uri= "/user/logout";//This is get route to a request to a read details logout
		
}
