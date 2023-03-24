package org.example;public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}package org.example;

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

        Thread.sleep(2000);

        WebElement yourpage =  By.xpath("/html/body/nav/div/nav/ul/li[1]").findElement(driver);

        yourpage.click();

        WebElement post = By.xpath("/html/body/div/div/a[1]/div").findElement(driver);

        post.click();

        Thread.sleep(2000);

        WebElement create = By.xpath("//*[@id=\"small-menu\"]/li[2]/a").findElement(driver);

        create.click();

        WebElement name = By.xpath("//*[@id=\"productName\"]").findElement(driver);

        name.click();

        name.sendKeys("Test post Drozdan");

        WebElement type = By.xpath("//*[@id=\"searchCity\"]").findElement(driver);

        type.click();

        WebElement typechoose = By.xpath("//*[@id=\"searchCity\"]/option[3]").findElement(driver);

        typechoose.click();

        WebElement description = driver.findElement(By.xpath("//*[@id=\"description\"]"));

        description.click();

        description.sendKeys("Description lalalalala");

        WebElement photo1 = By.xpath("//*[@id=\"file1\"]").findElement(driver);

        photo1.sendKeys("C:\\Users\\GameOn\\Downloads\\3зір.jpg");

        WebElement photo2 = By.xpath("//*[@id=\"file2\"]").findElement(driver);

        photo2.sendKeys("C:\\Users\\GameOn\\Downloads\\dkucl.jpg");

        WebElement photo3 = By.xpath("//*[@id=\"file3\"]").findElement(driver);

        photo3.sendKeys("C:\\Users\\GameOn\\Downloads\\2223.jpg");

        Thread.sleep(7000);

        WebElement addpost = By.xpath("//*[@id=\"collapseExample\"]/form/button").findElement(driver);

        addpost.click();

        Thread.sleep(4000);

        WebElement yourpage1 =  By.xpath("/html/body/nav/div/nav/ul/li[1]").findElement(driver);

        yourpage1.click();

        WebElement about = By.xpath("//*[@id=\"small-menu\"]/li[3]/a").findElement(driver);

        about.click();

        Thread.sleep(2000);

        WebElement search = By.xpath("//*[@id=\"searchWord\"]").findElement(driver);

        search.click();

        search.sendKeys("test1");

        Thread.sleep(2000);

        WebElement searchb = By.xpath("/html/body/nav/div/form/div/button").findElement(driver);

        searchb.click();

        WebElement perspage = By.xpath("/html/body/nav/div/div").findElement(driver);

        perspage.click();

        WebElement adddesc = By.xpath("/html/body/div/div/div/a").findElement(driver);

        adddesc.click();

        WebElement descr = By.xpath("//*[@id=\"description\"]").findElement(driver);

        descr.click();

        descr.sendKeys("Hello,Hakaton,our name is SMMSpace!");

        WebElement addbutton = By.xpath("//*[@id=\"collapseExample\"]/form/button").findElement(driver);

        addbutton.click();

        Thread.sleep(3000);

        WebElement logout = By.xpath("/html/body/div/div/div/div/form/button").findElement(driver);

        logout.click();

    }

}
