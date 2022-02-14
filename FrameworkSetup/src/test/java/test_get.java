import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test_get {
	@Test
	void test_01()
	{
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=");
		System.out.println(response.getStatusCode());
	}

}
 