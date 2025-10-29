package com.example.ThiKiemThu.phan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void registerTest() {
        driver.get("https://hoctotlamhay.vn/register");
        driver.findElement(By.id("name")).sendKeys("BaoAn123");
        driver.findElement(By.id("user_email")).sendKeys("anbach4865@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.linkText("Đăng ký"));
        System.out.println("Register access");
    }
    @Test
    public void loginTest() {
        driver.get("https://hoctotlamhay.vn/login");
        driver.findElement(By.id("user_email")).sendKeys("anbach4865@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.linkText("Đăng ký"));
        System.out.println("Login access");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
