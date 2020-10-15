package com.tnb.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//This Test case is about adding the USER from the admin module

public class AddUser {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "/opt/geckodriver/");


        FirefoxDriver driver = new FirefoxDriver();

        driver.get("http://10.9.80.182:8080/login");


        driver.findElementByName("username").sendKeys("kul_Subbarao");

        driver.findElementByName("password").sendKeys("Subbarao1516");


        driver.findElementByXPath("//button[@type='submit']").click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[text()='System']").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[text()='ADMIN']").click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElementByXPath("//span[text()='User Management']").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//a[text()='Users']").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElementByXPath("//button[text()='Add']").click();


        driver.findElementByXPath("//input[@class='form-control']").sendKeys("kul_srikanth");

        driver.findElementByXPath("//button[@type='submit']").click();


        driver.findElementByXPath("//div[@class='row form-group']//following::input[3]").sendKeys("104");

        driver.findElementByXPath("//div[@class='row form-group']//following::input[4]").sendKeys("A");
        driver.findElementByXPath("//div[@class='row form-group']//following::input[7]").sendKeys("1234");

        driver.findElementByXPath("//div[@class='row form-group']//following::input[8]").sendKeys("6789");
        driver.findElementByXPath("//div[@class='row form-group']//following::input[9]").sendKeys("SCADA");


        //state
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[11]/select"))
                .click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Select state = new Select(driver.findElementByXPath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[11]/select"));

        System.out.println(state);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        state.selectByIndex(1);

        //station
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[12]/select"))
                .click();



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Select station = new Select(driver.findElementByXPath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[12]/select"));

        System.out.println(station);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        station.selectByIndex(1);

        //unit
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[13]/select"))
                .click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Select unit = new Select(driver.findElementByXPath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[13]/select"));

        System.out.println(unit);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        unit.selectByIndex(1);


        //status
        driver.findElement(
                By.xpath("/html/body/div/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[14]/select"))
                .click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Select status = new Select(driver.findElementByXPath("/html/body/div/div[1]/div/div/main/div/div/div/div/div[2]/form/div/div[14]/select"));

        System.out.println(status);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        status.selectByIndex(1);

        driver.findElementByXPath("//button[@type='submit']").click();


    }


}
