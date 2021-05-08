package stepdefinition;

import io.cucumber.java.en.Given;
import mobile.pages.HomePage;

public class HomePageStepDef extends SetUp{

    @Given("I am on Ekar home page")
    public void iAmOnEkarHomePage() {

        HomePage homePage = new HomePage(driver());
    }
}
