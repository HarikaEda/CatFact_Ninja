package stepdefinitions;

import io.cucumber.java.en.Then;
import modules.FactsClass;
import org.json.JSONArray;
import org.junit.Assert;



public class Facts_Stepdefinitions extends FactsClass {
    @Then("verify that each fact is less than {int} characters")
    public void verifyHerBirFactinKarakterdenAzOldugunuDogrular(int expectedMaximumLength) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        boolean flag=true;
        for (int i = 0; i < dataJsonArray.length(); i++) {
            if(dataJsonArray.getJSONObject(i).length()>expectedMaximumLength) {
                flag=false;
                break;
            }
        }
        Assert.assertTrue(flag);
    }

    @Then("verifies that the random faction returning verify is less than {int} characters")
    public void verifyDonenRandoomFactinKarakterdenAzOldugunuDogrular(int expectedMaximumLength) {
        Assert.assertTrue(responseJsonPath.getString("fact").length()<=expectedMaximumLength);
        Assert.assertTrue(responseBodyJson.getString("fact").length()<=expectedMaximumLength);
        logger.info("random character test was performed");
    }


}