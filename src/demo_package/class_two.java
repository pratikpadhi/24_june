package demo_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_two {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=true&cc=IN&continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S2114655556%3A1685327293927662&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=Af_xneEfnv9GR0AR5r2INGv7kfMboyLWBOJPrQN7eWp1RA3sxr4QSULqTJ_vTYTkaR_3jL9dc3uhsQ");
	

	}

}
