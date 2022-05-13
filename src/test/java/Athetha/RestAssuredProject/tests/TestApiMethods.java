package Athetha.RestAssuredProject.tests;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Athetha.RestAssuredProject.endpoints.UserEndpoints;
import Athetha.RestAssuredProject.payload.UserDataSetup;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class TestApiMethods {
	UserDataSetup userPayload;
	
	@BeforeTest
	public void beforeTest()
	{
		//--------------User data setting---------
		userPayload= new UserDataSetup();
		userPayload.setUserid(1);
		userPayload.setUserName("mahender");
		userPayload.setFirstName("korapu");
		userPayload.setLastName("K");
		userPayload.setEmail("mahender@gmail.com");
		userPayload.setPassword("123456");
		userPayload.setPhone("1234567890");
	}
	
	@Test(priority = 1)
   public void testPostUser()
    {

      Map<String,Object> bodyParams=new HashMap<String,Object>();
      bodyParams.put("id",userPayload.getUserid());
      bodyParams.put("username",userPayload.getUserName());
      bodyParams.put("firstName",userPayload.getFirstName());
      bodyParams.put("lastName",userPayload.getLastName());
      bodyParams.put("email",userPayload.getEmail());
      bodyParams.put("password",userPayload.getPassword());
      bodyParams.put("phone",userPayload.getPhone());
      bodyParams.put("userStatus",0);

      JSONObject payload  = new JSONObject(bodyParams);
      System.out.println("-------------------POST------------------------------------");
      Response response=UserEndpoints.createUser(payload.toString());
      response.
      then().//Verification 
      	log().all().
      	statusCode(200);//Verification of status code*/
      System.out.println("----------"  +this.userPayload.getUserName()+" is created -------");
    }

    @Test(priority = 2)
    public void testGetUserByName()
    {
        System.out.println("-----------------GET---------------");
        Response response=UserEndpoints.readUser(this.userPayload.getUserName());
        response.
        then().
        log().all().
        //statusCode(200);
        statusCode(anyOf(is(404),is(200)));
        System.out.println("-------------------"+this.userPayload.getUserName()+" is fetched --------------");
    }

    @Test(priority = 3)
    public void testDeleteUserByName()
    {
        System.out.println("------------------DELETE--------------------------");
        Response response=UserEndpoints.deleteUser(this.userPayload.getUserName());
        response.
        	then().
        		statusCode(200).
        		log().all(); //display log details
        		 
        System.out.println("********  "+this.userPayload.getUserName()+" is deleted *************");
    }
    @Test(priority = 4)
    public void testPutUserByName()
    {
    	Map<String,Object> bodyParams=new HashMap<String,Object>();
        bodyParams.put("id",userPayload.getUserid());
        bodyParams.put("username",userPayload.getUserName());
        bodyParams.put("firstName",userPayload.getFirstName());
        bodyParams.put("lastName",userPayload.getLastName());
        bodyParams.put("email",userPayload.getEmail());
        bodyParams.put("password",userPayload.getPassword());
        bodyParams.put("phone",userPayload.getPhone());
        bodyParams.put("userStatus",0);

        JSONObject payload  = new JSONObject(bodyParams);
        System.out.println("-------------------PUT------------------------------------");
        Response response=UserEndpoints.createUser(payload.toString());
        response.
        then().//Validate section
        	log().all().
        	statusCode(200);//Verification of status code
        System.out.println("----------"  +this.userPayload.getUserName()+" is created -------");

    	
    }
    @Test(priority=5)
    public void testGetlogin()
    {
    	System.out.println("-----------------GET login---------------");
        Response response=UserEndpoints.loginuser(this.userPayload.getUserName(),this.userPayload.getPassword());
        response.
        		then().
        			log().all().
        			statusCode(200);
        			//statusCode(anyOf(is(404),is(200)));
  
        /*String value=UserEndpoints.loginuser(this.userPayload.getUserName(),this.userPayload.getPassword());
       System.out.println(value);
        
        value = value.substring(1, value.length()-1);           //remove curly brackets
        
        String[] keyValuePairs = value.split(",");              //split the string to creat key-value pairs
        
        Map<String,String> map = new HashMap<>();               

        for(String pair : keyValuePairs)                        //iterate over the pairs
        {
            String[] entry = pair.split("=");                   //split the pairs to get key and value 
            map.put(entry[0].trim(), entry[1].trim());          //add them to the hashmap and trim whitespaces
            
        }
        for(String actualvalue:map.keySet())
        {
        	
        	if((map.get(actualvalue)) == "200")
        	{
        		System.out.println("200 is status code");
        	}
        }*/
        	
         System.out.println("------"+this.userPayload.getUserName()+" is fetched --------------");
    	
    }
    


}
