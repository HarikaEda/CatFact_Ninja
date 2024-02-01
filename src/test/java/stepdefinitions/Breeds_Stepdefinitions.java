package stepdefinitions;

import io.cucumber.java.en.Then;
import modules.BreedsClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

public class Breeds_Stepdefinitions extends BreedsClass {

    @Then("verify the {string} phenomenon of the {string} key value of the object in the {int} index")
    public void verifyInciIndexdekiObjeninKeyDegerininOlgunuDogrular(String key,String expectedValue,int index) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        JSONObject breed=dataJsonArray.getJSONObject(index);
        Assert.assertEquals(expectedValue,breed.get(key));
        logger.info("The key value at the desired index was tested");
    }

    @Then("verify it is verified that there are {int} objects in the returned data")
    public void verifyDonenDatadaTaneObjeOlduguDogrulanir(int expectedObjectCount) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        Assert.assertEquals(expectedObjectCount,dataJsonArray.length());
        logger.info("Number of rotating objects tested");
    }

}
