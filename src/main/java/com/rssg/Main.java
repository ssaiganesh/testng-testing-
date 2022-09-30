package com.rssg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
        System.out.println(actualText);
        driver.close();
    }
}