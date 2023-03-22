package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GameOn\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://smm-space.herokuapp.com/");
        WebElement button = By.xpath(("/html/body/nav/div/button")).findElement(driver);
        button.click();
        WebElement input = By.xpath("//*[@id=\"email\"]").findElement(driver);
        input.click();
        input.sendKeys("tadebon434@wifame.com");
        WebElement inputpass = By.xpath("//*[@id=\"password\"]").findElement(driver);
        inputpass.click();
        inputpass.sendKeys("tadebon434@wifame.com\n");
        WebElement signin = By.xpath("/html/body/div[1]/div/form/button").findElement(driver);
        signin.click();
        WebElement s =  By.xpath("/html/body/nav/div/nav/ul/li[1]").findElement(driver);
        s.click();
    }
}
