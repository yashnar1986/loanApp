package io.duotech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.beans.User;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import io.restassured.mapper.ObjectMapperType;

public class RegisterUserViaAPI {
	
	User user = new User("Den", "Kim", "den@gmail.com", "123456");
	JsonPath jsonPath;
	String actual;
	String expected;

	@Given("Body details of API request")
	public void body_details_of_API_request() {
		System.out.println(user);
	}

	@When("User sends post request")
	public void user_sends_request() {
		
		RestAssured.baseURI = "http://duobank-env.eba-bgkwzq3h.us-east-2.elasticbeanstalk.com";
		jsonPath = given().log().all().body(user, ObjectMapperType.JACKSON_2).
		when().log().all().post("/api/register.php").
		then().extract().jsonPath();
		
	}

	@Then("API response message should be {string} and status code {string}")
	public void api_response_message_should_be(String message, String code) {
		actual = jsonPath.get("message").toString();
		expected = message;
		assertEquals(actual, expected);
		
		actual = jsonPath.get("status").toString();
		expected = code;
		assertEquals(actual, expected);
	}

}
