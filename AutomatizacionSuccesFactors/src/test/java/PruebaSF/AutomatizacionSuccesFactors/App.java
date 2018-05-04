package PruebaSF.AutomatizacionSuccesFactors;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PruebaSF.AutomatizacionSuccesFactors.AppTest;


public class App extends AppTest{
	public static void main(String[] args) 
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\andres.molina\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		App mainSF= new App();
		mainSF.loginSF(driver);
	}
}
