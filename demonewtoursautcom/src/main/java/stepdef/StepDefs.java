package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class StepDefs {

    public static WebDriver driver;

    @Given("^as an user I am on homepage$")
    public void as_an_user_I_am_on_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Given("^I login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_login_with_username_as_and_password_as(String arg1, String arg2) {
        driver.findElement(By.name("userName")).sendKeys(arg1);
        driver.findElement(By.name("password")).sendKeys(arg2);
    }

    @Given("^I click on signIn button$")
    public void i_click_on_signIn_button() {
        driver.findElement(By.name("login")).click();
    }
    @Then("^I should be successfully logged in$")
    public void i_should_be_successfully_logged_in() {
        String expected = driver.getCurrentUrl();
        assertThat(expected, startsWith("http://newtours.demoaut.com/mercuryreservation.php"));
    }

    @Given("^as an user I am on flight finder page$")
    public void as_an_user_I_am_on_flight_finder_page(){
    }

    @When("^i select journey type \"([^\"]*)\"$")
    public void i_select_journey_type(String arg1){
        List<WebElement> journeytype = driver.findElements(By.name("tripType"));
        for(WebElement element:journeytype){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }
    }

    @When("^i select passengers \"([^\"]*)\"$")
    public void i_select_passengers(String arg1) {
        List<WebElement> passengers = driver.findElements(By.name("passCount"));
        for(WebElement element:passengers){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }

    }

    @When("^i select depart from \"([^\"]*)\"$")
    public void i_select_depart_from(String arg1) {
        List<WebElement> departfrom = driver.findElements(By.name("fromPort"));
        for(WebElement element:departfrom){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }
    }

    @When("^i select depart to \"([^\"]*)\"$")
    public void i_select_depart_to(String arg1){
        List<WebElement> departto = driver.findElements(By.name("toPort"));
        for(WebElement element:departto){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }
    }

    @When("^i select class \"([^\"]*)\"$")
    public void i_select_class(String arg1) {
        List<WebElement> tripclass = driver.findElements(By.name("servClass"));
        for(WebElement element:tripclass){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }
    }

    @When("^i select airline \"([^\"]*)\"$")
    public void i_select_airline(String arg1) {
        List<WebElement> airline  = driver.findElements(By.name("airline"));
        for(WebElement element:airline){
            if (element.getText().equalsIgnoreCase(arg1)){
                element.click();
            }
        }
    }

    @When("^i click on continue button$")
    public void i_click_on_continue_button(){
        driver.findElement(By.name("findFlights")).click();
            }


    @Then("^i should see airline \"([^\"]*)\"$")
    public void i_should_see_airline(String arg1){
    }

    @Then("^i click continue button$")
    public void i_click_continue_button() {


    }

    @Then("^type in first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void type_in_first_name_and_last_name(String arg1, String arg2){

    }

    @Then("^i click on secure purchase button$")
    public void i_click_on_secure_purchase_button(){

    }

    @Then("^I should my itinery should be booked succesfully$")
    public void i_should_my_itinery_should_be_booked_succesfully(){

    }


}
