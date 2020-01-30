package jenkin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void runSetup() {
	String actual = "JenkinTestDemo";
	String expected = "Jenkin";
	
	if (actual.equals(expected))
	{
		System.out.println("Equals");
	}
	else {
		System.out.println("Not Equals");
	}

	}
	
	@Test
	public void TestEven()
	{
		int i=5;
		if (i%2 == 0) {
			System.out.println("Eevn");
		}
		
	}
	
	
}
