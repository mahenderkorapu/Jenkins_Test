package Athetha.RestAssuredProject.endpoints;

import java.util.Base64;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndpoints {

	public static Response createUser(String payload)//post method
	{
		RestAssured.baseURI=Routes.base_uri;
		Response response = RestAssured.
								given().//setup of request
									contentType(ContentType.JSON).
									accept(ContentType.JSON).
									body(payload).
								when().	//action of request
									post(Routes.post_uri);
		  return response;	
	}
	
	public static Response readUser(String userName) //get method
	{
		RestAssured.baseURI=Routes.base_uri;
		Response response = RestAssured.
								given().
									pathParam("username",userName).
								when().
									get(Routes.get_uri);
		return response;	
	}
	
	public static Response updateUser(String userName,String payload)//Put Method purpose
	{
		RestAssured.baseURI=Routes.base_uri;
		Response response = RestAssured.
								given().
									contentType(ContentType.JSON).
									accept(ContentType.JSON).
									pathParam("username",userName).
									body(payload).
								when().
									put(Routes.put_uri);
		return response;	
	}
	
	public static Response deleteUser(String userName) //Delete Method Purpose
	{
		RestAssured.baseURI=Routes.base_uri;
		Response response = RestAssured.
								given().
									pathParam("username",userName).
								when().
									delete(Routes.delete_uri);
		return response;	
	}
	
	public static Response loginuser(String userName,String password) //Response is an Interface.the response of a request made by REST Assured 
	{
		RestAssured.baseURI=Routes.base_uri;
		Response response = RestAssured.
								given().
									pathParam("username",userName).
									pathParam("password",password).
								when().
									get(Routes.get_login_uri);
		return response;
		
	}
	
}
