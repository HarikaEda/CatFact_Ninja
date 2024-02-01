package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import  static modules.BaseClass.spec;

import static io.restassured.RestAssured.reset;
import static utilities.ConfigReaders.getProperty;

public class Hooks {
    @Before()
    public void setUp() {
        spec=new RequestSpecBuilder().setBaseUri(getProperty("baseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Accept","application/json")
                .build();
    }

    @After
    public void tearDown() {
        reset();
    }
}
