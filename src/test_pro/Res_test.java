package test_pro;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pro.Res_page;


public class Res_test {

	WebDriver driver;
	String baseurl = "https://www.resume.com";
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		
		driver.manage().window().maximize();
		Res_page rp = new Res_page(driver);
		Thread.sleep(8000);
		rp.resb();
		Thread.sleep(15000);
		rp.bck();
		rp.ress();
		rp.bck();
		rp.resh();
		rp.bck();
		rp.cvlb();
		rp.bck();
		rp.cvls();
		rp.bck();
		rp.cvlh();
		rp.bck();
		rp.cad();
		rp.bck();
		rp.cahi();
		rp.bck();
		rp.cahj();
		rp.bck();
		Thread.sleep(8000);
		rp.getstart();
		rp.bck();
		rp.createres();
		rp.bck();
		rp.uploadres();
		rp.refreshh();
		rp.scrolldown();
		rp.scrolldown();
		rp.irbsec();
		rp.scrolldown();
		rp.scrolldown();
		rp.temps();
		rp.scrolldown();
		rp.scrolldown();
		rp.resumesamples();
		rp.bck(); 
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.scrolldown();
		rp.botoomlinks();
		rp.signin("abc@gmail.com", "rifad7414@gmail.com");
		Thread.sleep(5000);
		rp.resumeopt();
		Thread.sleep(2000);
		rp.personal("Muhammad", "Rifad", "rifad7414@gmail.com", "9742838296", "Kannur", "Kerala", "India", "670613");
		Thread.sleep(2000);
		rp.experience("Cognizant", "Jr Software Engineer", "11/2020", "11/2022", "Chennai", "Tamil Nadu", "India", "I worked for 2 years");
		Thread.sleep(2000);
		rp.skill("Java", "Selenium");
		Thread.sleep(2000);
		rp.education("Luminar Technolab", "Software Testing Specialist", "01/2024", "Calicut", "Kerala", "India", "I learned Software testing");
		Thread.sleep(2000);
		rp.templates(); 
		Thread.sleep(2000);
		rp.sections(); 
		Thread.sleep(2000);
		rp.summary("My name is Muhammad Rifad");
		Thread.sleep(5000);
		rp.tip();
		Thread.sleep(5000);
		rp.download();
		Thread.sleep(5000);
		rp.moreopt();
		Thread.sleep(2000);
		rp.coverlet("Muhammad", "Rifad", "rifad7414@gmail.com", "9742838296", "Hi, this is my cover letter", "Muhammad Rifad");
		Thread.sleep(2000);
		rp.clopt();
		Thread.sleep(2000);
		rp.resupload();
		Thread.sleep(20000);
		rp.profile();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
	}
}
