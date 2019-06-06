package Steps;
/**
 * Author: Olubunmi Onamuti
 * Scenario: A customer chooses a MacBook Pro with accessories from the Apple UK Website
 * Date: 06 June 2019
 * Attention: To run this file you need a geckodriver, swap "/Users/B-Virtual/Downloads/geckodriver" in @Given
 * in the first scenario for the path on your machine
 */

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.List;

public class buyMacbookProSteps {



        // First Scenario - Choose a MacBook Pro With Features and Accessories
        @Given("^that a user launches the url$")
        public void userLaunchesUrl() throws Throwable {

        /** The following have been commented out because they only work at local level and possibly a global alternative
         * is required. The code is left here because it might be useful/helpful when declaring the global alternative
         * hence why it is commented out with the view that global capabilities can be resolved
         //Set the gecko driver path after Selenium 3.0 driver paths cannot be set directly
         // therefore set system path to the Gecko driver
            System.setProperty("webdriver.gecko.driver", "/Users/B-Virtual/Downloads/geckodriver");

            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.apple.com/uk/"); **/

        System.out.println("Launch the URL for Apple UK");
        }


        @When("^a user chooses a MacBook Pro with the following features and accessories$")
        public void chooseMacBookPro(DataTable table) throws Throwable {
                List<List<String>> data = table.asLists();
                System.out.print(data.get(0).get(0));
                System.out.print(data.get(0).get(1));

        }


        @Then("^I can place an order for it$")
        public void placeOrder() throws Throwable {
                System.out.println(" User places order");
        }


        //Second Scenario - Check total price and VAT
        @Given("^when I choose the following items:$")
        public void iChooseTheFollowingItems(DataTable table) throws Throwable {
             System.out.println("The items chosen is listed");

        }


        @When("^I proceed to the checkout$")
        public void iProceedToCheckOut() throws Throwable {
               System.out.println(" User proceeds to checkout");
        }



        @Then("a total price of £{double}")
        public void a_total_price_of_£(Double double1) {
                // Write code here that turns the phrase above into concrete actions
                   System.out.println("Total price is displayed");
        }

        @Then("£{double} will be listed for VAT")
        public void £_will_be_listed_for_VAT(Double double1) {
                // Write code here that turns the phrase above into concrete actions
                System.out.println("VAT is displayed");
        }



}
