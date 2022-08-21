package stepDefshome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefs.SetupAndLogin;

public class LeadCreation extends SetupAndLogin {

	
		
	
	@Given("Clicking on the Lead button")
	public void clicking_on_the_lead_button() {

		driver.findElement(By.linkText("Leads")).click();
		
	}

	@Given("Opt for Create Lead")
	public void opt_for_create_lead() {

		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Given("Provide company name (.*)$")
	public void provide_company_name(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);

	}

	@Given("Provide first name (.*)$")
	public void provide_first_name(String firstname) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		}

	@Given("Provide last name (.*)$")
	public void provide_last_name(String lastname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@Given("Provide local name (.*)$")
	public void provide_local_name(String localname) {
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localname);
		
	}

	@Given("Provide department name (.*)$")
	public void provide_department_name(String deptname) {
		
		driver.findElement(By.name("departmentName")).sendKeys(deptname);
	}

	@Given("Provide description (.*)$")
	public void provide_description(String description) {
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);	
	}

	@Given("Provide emailid (.*)$")
	public void provide_emailid(String email) {
		

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		
	}


	@Given("Provide state (.*)$")
	public void provide_state(String state) {

		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectDownOption = new Select(stateDropdown);
		selectDownOption.selectByVisibleText(state);

		
	}

	@When("Create button is clicked")
	public void create_button_is_clicked() {

		driver.findElement(By.className("smallSubmit")).click();

	}

	@Then("Lead should be created and capture the page title to verify")
	public void lead_should_be_created_and_capture_the_page_title_to_verify() {

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		
	}

	
}
