package pk_MyNotes;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class LoginUser extends BaseClass {
	String loginid ;

	
	
		@BeforeTest
		public void before() {

			BaseClass.LOGIN("suchetha01@mail.com", "API05**");
			//String LOGINid = BaseClass.bookindid;
			//outh_token = BaseClass.outh_token;
		}

		@Test(priority = 1)
		public void LoginToExixtingUser() throws IOException, ParseException, org.json.simple.parser.ParseException {

		//	JSONObject prodjsonobj = BaseClass.ReadFile(".\\TestData\\CreateBooking.json");

			

		}
}
