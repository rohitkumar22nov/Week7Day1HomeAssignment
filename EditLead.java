package stepDefshome;



import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefs.SetupAndLogin;

public class EditLead extends SetupAndLogin{
	
	
	
	@Given ("click the lead link")
	public void clickLeadLink() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
		
	@And ("click the find lead option")
	public void clickFindLeadOption() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Lead')]")).click();
	}
	
	@And ("provide the search criteria to fetch the leads (.*)$")
	public void provideSearchCriteria(String firstname) {
		
		driver.findElement(By.xpath("//input[@name='firstName'][@style='width: 212px;']")).sendKeys(firstname);
	}
	
	@And ("click the find leads button to search based upon he given search criteria")
	public void findLead() throws InterruptedException {
		
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
	}
	
	
	@And ("click on the lead to be editted from the searched leads")
	public void clickLeadToBeEdited() {
		
		String leadName =	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Rohit'][1]")).getText();
		System.out.println(leadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Rohit'][1]")).click();

	}
	
	@And("verify the page title to vlaidate the screen")
	public void verifyPageTitleSearchScreen() {

		String titlePage = driver.getTitle();
		System.out.println(titlePage);

	}
	
	@And("click edit to make change for the selected lead")
	public void clickEditOption() {
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();		
	}
	
	
	@And("change the company name to a new name (.*)$")
	public void enterNewCompanyName(String companyname) {
		
		driver.findElement(By.xpath("//input[contains(@name,'Name')][contains(@id,'updateLeadForm_companyName')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'Name')][contains(@id,'updateLeadForm_companyName')]")).sendKeys(companyname);
	}
	
	@When("click update")
	public void clickUpdate() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[contains(@value,'Update')]")).click();
		Thread.sleep(5000);
		
	}
	
	
	@Then ("the lead is updated with new company name (.*)$")
	public void verifyUpdatedCompanyName(String companyname) {
		
		String updatedCompanyName = driver.findElement(By.xpath("//span[contains(@id,'viewLead_companyName')]")).getText();
		
		System.out.println("Required neew company name : " + companyname );
		System.out.println("Updated company name as : " + updatedCompanyName);

		if(updatedCompanyName.startsWith(companyname)) {
			System.out.println("Company name udpated successfully");
		}
		else {
			System.out.println("Not udpated, please check");
		}
	}
	

}
