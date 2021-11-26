package week3.day2;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3D2ImplementList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * SAMPLE PROGRAM TO IMPLEMENT List : ================================= NOTE:
		 * Java code is attached for your reference. 1. Launch the URL
		 * https://www.ajio.com/ 2. In the search box, type as "bags" and press enter 3.
		 * To the left of the screen under " Gender" click the "Men" 4. Under "Category"
		 * click "Fashion Bags" 5. Print the count of the items Found. 6. Get the list
		 * of brand of the products displayed in the page and print the list. 7. Get the
		 * list of names of the bags and print it
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
		element.sendKeys("bags");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String number = driver.findElement(By.className("length")).getText();
		System.out.println(number);
		System.out.println("*****Brands******");

		List<WebElement> brand = driver.findElements(By.className("brand"));

		for (WebElement eachoption : brand) {
			String str = eachoption.getText();
			System.out.println(str);

		}

		System.out.println("*****Bag Names******");

		List<WebElement> bags = driver.findElements(By.className("name"));

		for (WebElement eachoption2 : bags) {
			String str = eachoption2.getText();
			System.out.println(str);
		}

	}

}
