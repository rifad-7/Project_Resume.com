package page_pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Res_page {

	WebDriver driver;
	
	//locators of resume link and options
	By resln = By.xpath("//*[@id=\"resumeTab\"]/img");
	By resbuild = By.id("resumeBuilder");
	By ressam = By.id("resumeSamples");
	By reshow = By.id("writeResume");
	
	//locators of cover letter link and options
	By cl = By.xpath("//*[@id=\"coverLetterTab\"]/img");
	By clb = By.id("coverLetterBuilder");
	By cls = By.id("coverLetterSamples");
	By clh = By.id("writeCoverLetter");
	
	//locators of career advice link and options
	By ca = By.xpath("//*[@id=\"careerAdviceTab\"]/img");
	By cd = By.id("careerDevelopment");
	By chi = By.id("toInterview");
	By chj = By.id("getJob");
	
	//locator of popup
	By pclose = By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/button/svg/path");
	By pind = By.xpath("/html/body/div[6]/div/div/div/div[2]/div[2]/button/span");
	By pconnect = By.xpath("/html/body/div[6]/div/div/div/div[2]/div[2]/p[2]/a");
	
	//locators of get started
	By gs = By.xpath("//*[@id=\"navbar\"]/div[3]/ul/li[2]/a");
	
	//locator for create my resume
	By create = By.xpath("//*[@id=\"main-content\"]/div/div[1]/div/div[1]/div/button[1]");
	
	//locator for upload resume
	By upload = By.xpath("//*[@id=\"main-content\"]/div/div[1]/div/div[1]/div/button[2]");
	
	//locatror for intuitive resume builder and below options
	By irb = By.xpath("//*[@id=\"LDJ-0\"]/div/div[2]");
	By arj = By.xpath("//*[@id=\"LDJ-1\"]/div/div[2]");
	By fd = By.xpath("//*[@id=\"LDJ-2\"]/div/div[2]");
	
	//education template sections
	By temp1 = By.xpath("//*[@id=\"main-content\"]/div/div[3]/div[3]/div/div[1]/div/img");
	By skillsec = By.id("skill");
	By expsec = By.id("experience");
	By personalitysec = By.id("personality");
	
	//locators of each profession samples
	By acc = By.xpath("//*[@id=\"main-content\"]/div/div[4]/div/div[3]/a[1]");
	By security = By.xpath("//*[@id=\"main-content\"]/div/div[4]/div/div[3]/a[2]");
	By exploresam = By.xpath("//*[@id=\"main-content\"]/div/div[4]/div/div[4]/a");
	
	//locators to click links under job seekers
	By build = By.xpath("//*[@id=\"firstPart\"]/div/div/div[1]/a");
	By samples = By.xpath("//*[@id=\"firstPart\"]/div/div/div[2]/a");
	By apps = By.xpath("//*[@id=\"firstPart\"]/div/div/div[4]/a");
	
	//locators to click links under resources
	By caradvice = By.xpath("//*[@id=\"secondPart\"]/div/div/div[1]/a");
	By cardevt = By.xpath("//*[@id=\"secondPart\"]/div/div/div[3]/a");
	By interview = By.xpath("//*[@id=\"secondPart\"]/div/div/div[6]/a");
	
	//locators of links under help section
	By helpcenter = By.xpath("//*[@id=\"thirdPart\"]/div/div/div[1]/a");
	By about = By.xpath("//*[@id=\"thirdPart\"]/div/div/div[2]/a");
	By sitemap = By.xpath("//*[@id=\"thirdPart\"]/div/div/div[3]/a");
	
	//locators for app icons
	By linkedin = By.xpath("//*[@id=\"footer\"]/div/div[1]/div[4]/ul/li[2]/ul/li[1]/a");
	By fbook = By.xpath("//*[@id=\"footer\"]/div/div[1]/div[4]/ul/li[2]/ul/li[2]/a");
	By twitter = By.xpath("//*[@id=\"footer\"]/div/div[1]/div[4]/ul/li[2]/ul/li[3]/a");
	By insta = By.xpath("//*[@id=\"footer\"]/div/div[1]/div[4]/ul/li[2]/ul/li[4]/a");
	
	//locator for store icon
	By appstore = By.id("appStore");
	By playstore = By.id("googlePlay");
	
	//locator for sign-in link
	By signin = By.xpath("//*[@id=\"navbar\"]/div[3]/ul/li[1]/button");
	By connect = By.xpath("/html/body/div[6]/div/div/div/div[2]/div[2]/p[2]/a");
	By mail = By.id("email");
	By email_btn = By.id("send-email-btn");
	By another_method = By.xpath("//*[@id=\"main-content\"]/div/section/div/div[2]/div[1]/div/div/button");
	By google_sign = By.xpath("//*[@id=\"navbar\"]/div[1]/a");
	
	//LOCATOR OF LOGO
	By logo = By.id("resume-logo");
	
	//locator for ggl login button
	By signindeed = By.xpath("/html/body/div[6]/div/div/div/div[2]/div[2]/button/img"); 
	By glogbtn = By.id("login-google-button");
	By mailvalue = By.id("ifl-InputFormField-ihl-useId-passport-webapp-1");
	By cont = By.xpath("//*[@id=\"emailform\"]/button");
	By signcode = By.id("auth-page-google-otp-fallback");
	By signbtn = By.xpath("//*[@id=\"passpage-container\"]/main/div/div/div[2]/div/button[3]");
	
	//resume options
	By createres = By.xpath("//*[@id=\"addNewItem\"]/div/button");
	By myname = By.xpath("//*[@id=\"resume-page\"]/div/div/div/div[1]/div[1]");
	By fname = By.id("firstName");
	By lname = By.id("lastName");
	By email = By.id("email");
	By phn = By.id("phone");
	By city = By.id("city");
	By state = By.id("state");
	By country = By.id("country");
	By pcode = By.id("zip");
	By save1 = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[3]/div/button[2]");
	
	//experience section
	By exp = By.xpath("//*[@id=\"resume-page\"]/div/div/div/div[2]/div/div[2]");
	By comp = By.id("company");
	By title = By.id("title");
	By start = By.id("startDate");
	By end = By.id("endDate");
	By desc = By.xpath("//*[@id=\"left-content-wrapper\"]/div/div[9]/div/div[2]/div/div[2]/div");
	By save2 = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[3]/div[2]/button[2]");
	
	//skills section
	By skill = By.xpath("//*[@id=\"resume-page\"]/div/div/div/div[3]/div/div[2]/div/div/div[1]/div");
	By commskill = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/button/span");
	By timemanage = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[5]/button/span");
	By skillval = By.id("description");
	By save3 = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[3]/div/button[2]");
	
	//education section
	By edu = By.xpath("//*[@id=\"resume-page\"]/div/div/div/div[4]/div/div[2]/div/div/div[1]/div[1]");
	By sch = By.id("school");
	By qual = By.id("qualification");
	By desc2 = By.xpath("//*[@id=\"left-content-wrapper\"]/div/div[7]/div/div[2]/div/div[2]/div");
	By save4 = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[3]/div[2]/button[2]");
	
	//summary section
	By summary = By.xpath("//*[@id=\"resume-page\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]");
	By sumryval = By.xpath("//*[@id=\"left-content-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div/div/div");
	By sumrysug = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/button/span");
	By save5 = By.xpath("//*[@id=\"common-edit-resume-section-modal\"]/div/div[3]/div/button[2]");
	
	//templates button
	By template = By.xpath("//*[@id=\"templates-btn-container\"]/button");
	By templ = By.xpath("//*[@id=\"itemTempe\"]/div/img");
	By templ1 = By.xpath("//*[@id=\"itemVega\"]/div/img");
	
	//manage button
	By manage = By.xpath("//*[@id=\"new-common-top-area\"]/div[1]/div[2]/button");
	By sumswitch = By.id("switchBtn-summary");
	By langswitch = By.id("switchBtn-languages");
	By certiswitch = By.id("switchBtn-certificates");
	By closebtn = By.xpath("//*[@id=\"drawer-container\"]/div/div[1]/button");
	
	//tips button
	By tips = By.xpath("//*[@id=\"new-common-top-area\"]/div[1]/div[3]/button");
	By closebtn2 = By.xpath("//*[@id=\"drawer-container\"]/div/div[1]/button");
	
	//download button
	By download = By.xpath("//*[@id=\"downloadListButton-top\"]");
	By pdf = By.id("PDF");
	By text = By.id("TXT");
	By print = By.id("PRINT");
	By remind = By.xpath("/html/body/div[7]/div/div/div[2]/button");
	
	//more button
	By more = By.xpath("//*[@id=\"new-common-top-area\"]/div[1]/div[3]/div/button");
	By dupe = By.xpath("//*[@id=\"popover-container\"]/div[2]/button[1]");
	By rename = By.id("renameText");
	By save6 = By.xpath("/html/body/div[7]/div/div/div/div[2]/button[2]");
	By duperes = By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[1]/div[1]/button[1]");
	
	By del = By.xpath("//*[@id=\"popover-container\"]/div[2]/button[2]");
	By delbtn = By.xpath("/html/body/div[7]/div/div/div/div/button[2]");
	By delbtn2 = By.xpath("/html/body/div[8]/div/div/div/div/button[2]");
	
	//dashboard button
	By dash = By.xpath("//*[@id=\"navbar\"]/div[3]/ul/li/a");
	
	//cover letter
	By cover = By.xpath("//*[@id=\"item-tab-1\"]");
	By cltemp = By.xpath("//*[@id=\"itemMu\"]/div/img");	
	By clname = By.xpath("//*[@id=\"cover-letter-page\"]/div[1]");
	By save7 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[3]/div/button[2]");
	By clbody = By.xpath("//*[@id=\"cover-letter-page\"]/div[2]/div");
	By clbodyval = By.xpath("//*[@id=\"left-content-wrapper\"]/div/div/div/div[2]/div/div[2]/div");
	By clsug1 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[2]/div/div[2]/div[2]/div/ul/li[1]/button");
	By clsug2 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[2]/div/div[2]/div[2]/div/ul/li[2]/button");
	By clsug3 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[2]/div/div[2]/div[2]/div/ul/li[3]/button");
	By save8 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[3]/div/button[2]");
	By signature = By.xpath("//*[@id=\"cover-letter-page\"]/div[3]/div");
	By signval = By.xpath("//*[@id=\"left-content-wrapper\"]/div/div/div/div[2]/div/div[2]/div");
	By save9 = By.xpath("//*[@id=\"common-edit-cover-letter-section-modal\"]/div/div[3]/div/button[2]");
	
	//change template
	By clchange = By.xpath("//*[@id=\"templates-btn-container\"]/button");
	By cltemp2 = By.xpath("//*[@id=\"itemDelta\"]/div/img");
	
	//tips
	By cltip = By.xpath("//*[@id=\"new-common-top-area\"]/div[1]/div[2]/button");
	By cltipclose = By.xpath("//*[@id=\"drawer-container\"]/div/div[1]/button");
	
	//download
	By cldownload = By.xpath("//*[@id=\"downloadListButton-top\"]");
	
	//more button
	By more2 = By.xpath("//*[@id=\"new-common-top-area\"]/div[1]/div[3]/div/button");
	By dupe2 = By.xpath("//*[@id=\"popover-container\"]/div[2]/button[1]");
	By save10 = By.xpath("/html/body/div[7]/div/div/div/div[2]/button[2]");
	By dupecl = By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[1]/div[1]/button[2]");
	
	By del2 = By.xpath("//*[@id=\"popover-container\"]/div[2]/button[2]");
	By delbtn3 = By.xpath("/html/body/div[7]/div/div/div/div/button[2]");
	By delbtn4 = By.xpath("/html/body/div[7]/div/div/div/div/button[2]");
	
	//resume upload
	By uploadbtn = By.xpath("/html/body/div[6]/div/div/div[2]/button");
	
	//profile icon
	By profile = By.xpath("//*[@id=\"rightMenu\"]/img");
	By account = By.id("accountItem");
	By logout = By.id("logoutItem");
	
	//method to connect driver of pages class and test class
	public Res_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	
	//method to scroll down
	public void scrolldown() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
	}
	
	//method to refresh window
	public void refreshh() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	//method to navigate back
	public void bck() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//method to click resume builder under resume link
	public void resb() throws InterruptedException {
		
		driver.findElement(resln).click();
		Thread.sleep(2000);
		driver.findElement(resbuild).click();
		Thread.sleep(5000);
	}
	
	//method to click resume samples under resume link
	public void ress() throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(resln).click();
		Thread.sleep(2000);
		driver.findElement(ressam).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click on how to write resume under resume link
	public void resh() throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(resln).click();
		Thread.sleep(2000);
		driver.findElement(reshow).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click cover letter builder under cover letter link
	public void cvlb() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(cl).click();
		Thread.sleep(2000);
		driver.findElement(clb).click();
		Thread.sleep(5000);
	}
	
	//method to click cover letter samples under cover letter link
	public void cvls() throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(cl).click();
		Thread.sleep(2000);
		driver.findElement(cls).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click on how to write cover letter under cover letter link
	public void cvlh() throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(cl).click();
		Thread.sleep(2000);
		driver.findElement(clh).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click career development under career link
	public void cad() throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(ca).click();
		Thread.sleep(2000);
		driver.findElement(cd).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click on how to interview under career link
	public void cahi() throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(ca).click();
		Thread.sleep(2000);
		driver.findElement(chi).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click on how to get a job under career link
	public void cahj() throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(ca).click();
		Thread.sleep(2000);
		driver.findElement(chj).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	
	//method to click get started button
	public void getstart() throws InterruptedException {
		
		driver.findElement(gs).click();
		Thread.sleep(3000);
	}
	
	//method to click Create Resume button
	public void createres() throws InterruptedException {
		
		driver.findElement(create).click();
		Thread.sleep(4000);
	}
	
	//method to click Upload Resume button
	public void uploadres() throws InterruptedException {
		
		driver.findElement(upload).click();
		Thread.sleep(4000);
	}
	
	//method to select options with images
	public void irbsec() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(irb).click();
		Thread.sleep(2000);
		driver.findElement(arj).click();
		Thread.sleep(2000);
		driver.findElement(fd).click();
		Thread.sleep(2000);
	}
	
	
	public void temps() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to select a template manually from education section
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(2000);
		
		//to select a template manually from skill section
		driver.findElement(skillsec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		driver.findElement(skillsec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(2000);
		
		//to select a template manually from experience section
		driver.findElement(expsec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		driver.findElement(expsec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(2000);
		
		//to select a template manually from personality section
		driver.findElement(personalitysec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		driver.findElement(personalitysec).click();
		Thread.sleep(6000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(3000);
		
	}
	
	public void resumesamples() throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		//to click on accountant
		driver.findElement(acc).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		//to click on security guard
		driver.findElement(security).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		//to click on explore all samples
		driver.findElement(exploresam).click();
		Thread.sleep(4000);
	}
	
	public void botoomlinks() throws InterruptedException {
	
		driver.findElement(build).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(samples).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(apps).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(caradvice).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(cardevt).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(interview).click();
		Thread.sleep(4000);	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(helpcenter).click();
		Thread.sleep(6000);
		
		driver.findElement(about).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(sitemap).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(linkedin).click();
		Thread.sleep(6000);
		
		driver.findElement(fbook).click();
		Thread.sleep(6000);
		
		driver.findElement(twitter).click();
		Thread.sleep(6000);
		
		driver.findElement(insta).click();
		Thread.sleep(6000);
		
		driver.findElement(appstore).click();
		Thread.sleep(6000);
		
		driver.findElement(playstore).click();
		Thread.sleep(6000);
	}
	
	//method to click sign-in link
	public void signin(String e, String m) throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		driver.findElement(signin).click();
		Thread.sleep(10000);
		
//		act.moveToElement(driver.findElement(connect)).click().perform();
//		Thread.sleep(5000);
		
		driver.findElement(mail).sendKeys(e);
		Thread.sleep(2000);
		
		driver.findElement(email_btn).click();	
		Thread.sleep(5000);
		
		driver.findElement(another_method).click();
		Thread.sleep(10000);
		
//		driver.findElement(google_sign).click();
		
		act.moveToElement(driver.findElement(logo)).click().perform();
		Thread.sleep(5000);
		
		driver.findElement(signin).click();
		Thread.sleep(15000);
		
//		driver.findElement(signindeed).click();
//		Thread.sleep(5000);
		
		driver.findElement(mailvalue).sendKeys(m);;
		Thread.sleep(5000);
		
		driver.findElement(cont).click();
		Thread.sleep(25000);
		
		driver.findElement(signcode).click();
		Thread.sleep(20000);
		
		driver.findElement(signbtn).click();
		Thread.sleep(6000);
	}
	
	public void resumeopt() throws InterruptedException {
		
//		driver.findElement(createres).click();
		Thread.sleep(15000);
		driver.findElement(myname).click();
	}
	
	public void personal(String f, String l, String e, String p, String c, String s, String co, String z) throws InterruptedException {
		
		driver.findElement(fname).clear();
		driver.findElement(fname).sendKeys(f);
		driver.findElement(lname).clear();
		driver.findElement(lname).sendKeys(l);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(e);
		driver.findElement(phn).sendKeys(p);
		driver.findElement(city).sendKeys(c);
		driver.findElement(state).sendKeys(s);
		driver.findElement(country).sendKeys(co);
		driver.findElement(pcode).sendKeys(z);
		Thread.sleep(5000);
		driver.findElement(save1).click();
		Thread.sleep(5000);
	}
	
	public void experience(String e, String t, String s, String e1, String c, String s1, String co,String d) throws InterruptedException {
		
		driver.findElement(exp).click();
		Thread.sleep(2000);
		driver.findElement(comp).sendKeys(e);
		driver.findElement(title).sendKeys(t);
		driver.findElement(start).sendKeys(s);
		driver.findElement(end).sendKeys(e1);
		driver.findElement(city).sendKeys(c);
		driver.findElement(state).sendKeys(s1);
		driver.findElement(country).sendKeys(co);
		driver.findElement(desc).sendKeys(d);
		Thread.sleep(5000);
		driver.findElement(save2).click();
		Thread.sleep(5000);
	}
	
	public void skill(String s1, String s2) throws InterruptedException {
		
		driver.findElement(skill).click();
		Thread.sleep(2000);
		driver.findElement(commskill).click();
		driver.findElement(timemanage).click();
		
		Actions act = new Actions(driver);
		
		driver.findElement(skillval).sendKeys(s1);
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.findElement(skillval).sendKeys(s2);
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
		driver.findElement(save3).click();
		Thread.sleep(5000);
	}
	
	public void education(String s, String q, String e, String c, String st, String co, String d) throws InterruptedException {
		
		driver.findElement(edu).click();
		Thread.sleep(2000);
		
		driver.findElement(sch).sendKeys(s);
		driver.findElement(qual).sendKeys(q);
		driver.findElement(end).sendKeys(e);
		driver.findElement(city).sendKeys(c);
		driver.findElement(state).sendKeys(st);
		driver.findElement(country).sendKeys(co);
		driver.findElement(desc2).sendKeys(d);
		
		Thread.sleep(5000);
		driver.findElement(save4).click();
		Thread.sleep(5000);
	}
	
	public void templates() throws InterruptedException {
		
		driver.findElement(template).click();
		Thread.sleep(5000);
		driver.findElement(templ).click();
		Thread.sleep(10000);
		driver.findElement(template).click();
		Thread.sleep(5000);
		driver.findElement(templ1).click();
		Thread.sleep(10000);
	}
	
	public void sections() throws InterruptedException {
		
		driver.findElement(manage).click();
		Thread.sleep(2000);
		
		driver.findElement(sumswitch).click();
		Thread.sleep(2000);
		driver.findElement(langswitch).click();
		Thread.sleep(2000);
		driver.findElement(langswitch).click();
		Thread.sleep(2000);
		driver.findElement(certiswitch).click();
		Thread.sleep(2000);
		driver.findElement(certiswitch).click();
		Thread.sleep(2000);
	}
	
	public void summary(String s) throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(summary).click();
		Thread.sleep(2000);
		driver.findElement(sumryval).sendKeys(s);
		Thread.sleep(2000);
		driver.findElement(sumrysug).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(closebtn)).click().perform();
		Thread.sleep(5000);
		driver.findElement(save5).click();
	}
	
	public void tip() throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(tips).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(closebtn2)).click().perform();
		Thread.sleep(2000);
	}
	
	public void download() throws InterruptedException {
		
		driver.findElement(download).click();
		Thread.sleep(2000);
		driver.findElement(pdf).click();
		Thread.sleep(15000);
		driver.findElement(remind).click();
		Thread.sleep(2000);
		driver.findElement(download).click();
		Thread.sleep(2000);
		driver.findElement(text).click();
		Thread.sleep(15000);
		driver.findElement(remind).click();
		Thread.sleep(2000);
		driver.findElement(download).click();
		Thread.sleep(2000);
		
		driver.findElement(print).click();
		Thread.sleep(15000);
		driver.findElement(remind).click();
		Thread.sleep(2000);
	}
	
	public void moreopt() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(duperes)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more).click();
		Thread.sleep(2000);
		driver.findElement(dupe).click();
		Thread.sleep(3000);
		driver.findElement(save6).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(duperes)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more).click();
		Thread.sleep(2000);
		driver.findElement(del).click();
		Thread.sleep(2000);
		driver.findElement(delbtn).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		act.moveToElement(driver.findElement(duperes)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more).click();
		Thread.sleep(2000);
		driver.findElement(del).click();
		Thread.sleep(2000);
		driver.findElement(delbtn2).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(dash).click();
		Thread.sleep(5000);
	}
	
	public void coverlet(String f, String l, String e, String p, String v, String si) throws InterruptedException {
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		driver.findElement(cover).click();
		Thread.sleep(10000);
//		driver.findElement(createres).click();
		driver.findElement(cltemp).click();
		Thread.sleep(3000);
		driver.findElement(clname).click();
		Thread.sleep(2000);
		driver.findElement(fname).clear();
		driver.findElement(fname).sendKeys(f);
		driver.findElement(lname).clear();
		driver.findElement(lname).sendKeys(l);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(e);
		driver.findElement(phn).sendKeys(p);
		Thread.sleep(5000);
		driver.findElement(save7).click();
		Thread.sleep(5000);
		driver.findElement(clbody).click();
		Thread.sleep(2000);
		driver.findElement(clbodyval).sendKeys(v);
		Thread.sleep(2000);
		driver.findElement(clsug1).click();
		Thread.sleep(2000);
		driver.findElement(clsug2).click();
		Thread.sleep(2000);
		driver.findElement(clsug3).click();
		Thread.sleep(5000);
		driver.findElement(save8).click();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(signature)).click().perform();
		Thread.sleep(2000);
		driver.findElement(signval).clear();
		driver.findElement(signval).sendKeys(si);
		driver.findElement(save9).click();
		Thread.sleep(5000);
	}
	
	public void clopt() throws InterruptedException {
		
		driver.findElement(clchange).click();
		Thread.sleep(3000);
		driver.findElement(cltemp2).click();
		Thread.sleep(5000);
		driver.findElement(cltip).click();
		Thread.sleep(3000);
		driver.findElement(cltipclose).click();
		Thread.sleep(3000);
		driver.findElement(cldownload).click();
		Thread.sleep(3000);
		Thread.sleep(2000);
		driver.findElement(pdf).click();
		Thread.sleep(15000);

		driver.findElement(cldownload).click();
		Thread.sleep(2000);
		driver.findElement(text).click();
		Thread.sleep(15000);

		driver.findElement(cldownload).click();
		Thread.sleep(2000);
		
		driver.findElement(print).click();
		Thread.sleep(15000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(dupecl)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more2).click();
		Thread.sleep(2000);
		driver.findElement(dupe2).click();
		Thread.sleep(3000);
		driver.findElement(save10).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(dupecl)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more2).click();
		Thread.sleep(2000);
		driver.findElement(del2).click();
		Thread.sleep(2000);
		driver.findElement(delbtn3).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		act.moveToElement(driver.findElement(dupecl)).click().perform();
		Thread.sleep(5000);
		driver.findElement(more2).click();
		Thread.sleep(2000);
		driver.findElement(del2).click();
		Thread.sleep(2000);
		driver.findElement(delbtn4).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(dash).click();
		Thread.sleep(5000);
	}
	
	public void resupload() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		driver.findElement(uploadbtn).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Rif7414\\Desktop\\Au3script\\P.exe");
		Thread.sleep(5000);
	}
	
	public void profile() throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(profile).click();
		Thread.sleep(2000);
		driver.findElement(account).click();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(dash).click();
		Thread.sleep(5000);
		driver.findElement(profile).click();
		Thread.sleep(2000);
		driver.findElement(logout).click();
		Thread.sleep(15000);
		
	}
}
